package com.freekiosk.lite;

import java.net.URI;
import java.net.URISyntaxException;

final class KioskConfig {
    private static final String DEFAULT_URL = "https://example.com";

    private KioskConfig() {
    }

    static String resolveUrl(String configuredUrl) {
        if (configuredUrl == null || configuredUrl.trim().isEmpty()) {
            return DEFAULT_URL;
        }

        String value = configuredUrl.trim();
        try {
            String scheme = new URI(value).getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                return value;
            }
        } catch (URISyntaxException ignored) {
            // Invalid URLs use the safe default.
        }

        return DEFAULT_URL;
    }
}
