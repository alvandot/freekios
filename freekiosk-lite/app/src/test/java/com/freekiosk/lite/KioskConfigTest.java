package com.freekiosk.lite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KioskConfigTest {
    @Test
    public void usesDefaultUrlForMissingConfiguration() {
        assertEquals("https://example.com", KioskConfig.resolveUrl(null));
        assertEquals("https://example.com", KioskConfig.resolveUrl("  "));
    }

    @Test
    public void acceptsHttpAndHttpsUrls() {
        assertEquals("http://kiosk.local", KioskConfig.resolveUrl(" http://kiosk.local "));
        assertEquals("https://display.example/path", KioskConfig.resolveUrl("https://display.example/path"));
    }

    @Test
    public void rejectsUnsupportedSchemes() {
        assertEquals("https://example.com", KioskConfig.resolveUrl("file:///etc/passwd"));
        assertEquals("https://example.com", KioskConfig.resolveUrl("javascript:alert(1)"));
    }
}
