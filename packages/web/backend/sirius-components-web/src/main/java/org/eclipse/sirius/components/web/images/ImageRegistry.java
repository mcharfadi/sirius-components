/*******************************************************************************
 * Copyright (c) 2022, 2023 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.components.web.images;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.sirius.components.collaborative.diagrams.export.api.IImageRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Registers the images for later retrieval as \<symbol\>.
 *
 * @author rpage
 */
@Service
@RequestScope
public class ImageRegistry implements IImageRegistry {

    private static final String SVG = "svg";

    private final Map<URI, UUID> imageRegistry = new HashMap<>();

    private final HttpClient imageFetcher;

    private final URI imageBasePath;

    private final Logger logger = LoggerFactory.getLogger(ImageRegistry.class);

    public ImageRegistry(HttpServletRequest request, @Value("${sirius.components.imageRegistry.referer.enabled:true}") boolean refererEnabled) throws URISyntaxException {
        Objects.requireNonNull(request);

        URI uri = URI.create(this.getRequestURL(request, refererEnabled));
        String imageBasePathString = uri.getScheme() + "://" + uri.getHost();
        if (uri.getPort() != -1) {
            imageBasePathString += ":" + uri.getPort();
        }
        imageBasePathString += "/api/images";
        this.imageBasePath = new URI(imageBasePathString);
        this.imageFetcher = this.buildImageClient(request);
    }

    private String getRequestURL(HttpServletRequest request, boolean refererEnabled) {
        Optional<String> optionalRequestURL = Optional.empty();
        if (refererEnabled) {
            optionalRequestURL = Optional.ofNullable(request.getHeader(HttpHeaders.REFERER));
        }
        return optionalRequestURL.orElse(request.getRequestURL().toString());
    }

    @Override
    public UUID registerImage(String imageURL) {
        try {
            URI imageFullPath = new URI(this.imageBasePath.toString() + imageURL);
            UUID symbolId = this.imageRegistry.get(imageFullPath);
            if (symbolId == null) {
                symbolId = UUID.randomUUID();
                this.imageRegistry.put(imageFullPath, symbolId);
            }
            return symbolId;
        } catch (URISyntaxException e) {
            this.logger.warn(e.getMessage(), e);
            return null;
        }
    }

    @Override
    public StringBuilder getReferencedImageSymbols() {
        StringBuilder symbols = new StringBuilder();
        this.imageRegistry.entrySet().forEach(entry -> symbols.append(this.getReferencedImage(entry.getKey(), entry.getValue())));
        return symbols;
    }

    @Override
    public StringBuilder getImage(UUID symbolId) {
        StringBuilder symbols = new StringBuilder();
        this.imageRegistry.entrySet().stream().filter(entry -> entry.getValue().equals(symbolId)).findFirst().ifPresent(entry -> symbols.append(this.getImage(entry.getKey(), entry.getValue())));
        return symbols;
    }

    private StringBuilder getReferencedImage(URI imageURI, UUID symbolId) {
        HttpRequest request = HttpRequest.newBuilder().uri(imageURI).GET().build();

        try {
            Optional<String> imageType = Optional.empty();

            byte[] byteContent = this.imageFetcher.send(request, BodyHandlers.ofByteArray()).body();
            String content = new String(byteContent);
            if (content.contains("<svg")) {
                imageType = Optional.of(SVG);
            }

            if (imageType.isEmpty()) {
                imageType = this.getImageTypeFromURI(imageURI);
            }

            if (imageType.isEmpty()) {
                imageType = this.getImageTypeContent(byteContent);
            }

            if (imageType.isEmpty()) {
                this.logger.warn("The type of the image at URI " + imageURI + " is not valid.");
            } else {
                return this.addSymbolElement(symbolId, imageType.get(), byteContent);
            }
        } catch (IOException | InterruptedException e) {
            this.logger.warn(e.getMessage(), e);
        }
        return new StringBuilder();

    }

    private StringBuilder addSymbolElement(UUID symbolId, String imageType, byte[] content) {
        StringBuilder symbol = new StringBuilder();
        symbol.append("<symbol id=\"" + symbolId + "\">");
        if (SVG.equals(imageType)) {
            symbol.append(this.updateSvgContent(content));
        } else {
            symbol.append("<image xlink:href=\"");
            symbol.append(this.getBase64Image(imageType, content));
            symbol.append('"');
            symbol.append(" width=\"100%\" height=\"100%\"/>");
        }
        return symbol.append("</symbol>");
    }

    private StringBuilder getImage(URI imageURI, UUID symbolId) {
        HttpRequest request = HttpRequest.newBuilder().uri(imageURI).GET().build();

        try {
            Optional<String> imageType = Optional.empty();

            byte[] byteContent = this.imageFetcher.send(request, BodyHandlers.ofByteArray()).body();
            String content = new String(byteContent);
            if (content.contains("<svg")) {
                imageType = Optional.of(SVG);
            }

            if (imageType.isEmpty()) {
                imageType = this.getImageTypeFromURI(imageURI);
            }

            if (imageType.isEmpty()) {
                imageType = this.getImageTypeContent(byteContent);
            }

            if (imageType.isEmpty()) {
                this.logger.warn("The type of the image at URI " + imageURI + " is not valid.");
            } else {
                return this.getBase64Image(imageType.get(), byteContent);
            }
        } catch (IOException | InterruptedException e) {
            this.logger.warn(e.getMessage(), e);
        }
        return new StringBuilder();

    }

    private StringBuilder getBase64Image(String imageType, byte[] content) {
        StringBuilder symbol = new StringBuilder();
        symbol.append("data:");
        if (imageType.startsWith("image/")) {
            symbol.append(imageType);
        } else {
            symbol.append("image/");
            symbol.append(imageType);
        }
        symbol.append(";charset=utf-8;base64,");
        String encodedString = Base64.getEncoder().encodeToString(content);
        symbol.append(encodedString);
        return symbol;
    }

    private String updateSvgContent(byte[] content) {
        String xmlDeclaration = "<\\?xml.*?\\?>";

        String cleanSvgString = new String(content).replaceAll(xmlDeclaration, "");

        return cleanSvgString;
    }

    private Optional<String> getImageTypeFromURI(URI imageURI) {
        String imagePath = imageURI.getPath();
        String fileName = imagePath.substring(imagePath.lastIndexOf("/") + 1);

        // @formatter:off
        return Optional.ofNullable(fileName)
                .filter(name -> name.contains("."))
                .map(name -> name.substring(fileName.lastIndexOf(".") + 1));
        // @formatter:on
    }

    private Optional<String> getImageTypeContent(byte[] byteContent) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(byteContent);
        String contentType = URLConnection.guessContentTypeFromStream(bais);
        return Optional.ofNullable(contentType);
    }

    private HttpClient buildImageClient(HttpServletRequest request) {
        this.addRequestCookies(request);
        return HttpClient.newBuilder().cookieHandler(CookieHandler.getDefault()).build();
    }

    private void addRequestCookies(HttpServletRequest request) {
        CookieHandler.setDefault(new CookieManager());
        Cookie[] cookies = request.getCookies();
        CookieStore store = ((CookieManager) CookieHandler.getDefault()).getCookieStore();
        if (cookies != null) {
            // @formatter:off
            Arrays.stream(cookies).forEach(cookie -> {
                HttpCookie newCookie = new HttpCookie(cookie.getName(), cookie.getValue());
                newCookie.setPath("/");
                newCookie.setVersion(0);
                store.add(this.imageBasePath, newCookie);
            });
            // @formatter:on
        }
    }
}
