package com.freekiosk.lite;

import android.net.Uri;

final class KioskConfig {
    private static final String DEFAULT_URL = "https://example.com";

    private KioskConfig() {
    }

    static String resolveUrl(String configuredUrl) {
        if (configuredUrl == null || configuredUrl.trim().isEmpty()) {
            return DEFAULT_URL;
        }

        String value = configuredUrl.trim();
        Uri uri = Uri.parse(value);
        if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
            return value;
        }

        return DEFAULT_URL;
    }
}
