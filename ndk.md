# NDK

Native Development Kit.

<http://developer.android.com/tools/sdk/ndk/index.html>

API needed for native compiled code (e.g. from C) API.

API is exactly like regular JNI, which you should learn first, e.g. at <https://github.com/cirosantilli/java-cheat/tree/91caa12e8e4e468441539fe394e5ceb1d09007aa/jni>

Alternative: RenderScript <http://www.developer.com/ws/android/development-tools/writing-native-android-code-ndk-vs.-renderscript.html> TODO vs.

## Docs

## API reference

Very incomplete at: <http://developer.android.com/ndk/reference/index.html>

E.g.: `<android/log.h>` is not there, but it is mentioned at: <http://developer.android.com/ndk/guides/stable_apis.html>

<http://stackoverflow.com/questions/4638778/ndk-api-reference-docs> says that headers under `<ndk>/platform/android-$VERSION/$ARCH/usr/include` have a lot of documentation comments which you should rely on instead, which is true.

The actual implementation `.cpp` files seem to be scattered under `<ndk>/frameworks` of the AOSP. Use `find`.

## Versions

NDK updates don't come out together with the newest SDK! E.g., at some point there was SDK 23, but only NDK 21: <https://groups.google.com/forum/#!topic/android-ndk/5yBELmoFAYg>

## samples

Samples under `$ANDROID_NDK/ndk/samples/`. `hello-jni` is the most basic one.

Build as:

    # Tool present on the root of the NDK. Cross compiles to a ton of platforms.
    ndk-build
    # Create build.xml, as per: http://stackoverflow.com/questions/5572304/how-to-build-the-android-sample-projects-using-ant-build-xml-does-not-exist
    android update project -p . -t android-22
    ant clean
    ant debug
    ant installd

More samples at: <https://github.com/googlesamples/android-ndk>
