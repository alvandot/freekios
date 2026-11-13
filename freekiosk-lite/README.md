# FreeKiosk Lite

FreeKiosk Lite is an independent Android kiosk application. It lives entirely
under `freekiosk-lite/` so the original FreeKiosk source tree remains unchanged.

The app opens a configured HTTP(S) URL in an immersive WebView. A URL can be
passed with the launch intent extra named `url`; otherwise it opens
`https://example.com`.

## Local commands

```bash
./gradlew testDebugUnitTest
./gradlew assembleDebug
```

The debug APK is written to
`app/build/outputs/apk/debug/app-debug.apk`.
