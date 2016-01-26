# NDK

Native Development Kit.

<http://developer.android.com/tools/sdk/ndk/index.html>

API needed for native compiled code (e.g. from C) API.

API is exactly like regular JNI, which you should learn first, e.g. at <https://github.com/cirosantilli/java-cheat/tree/91caa12e8e4e468441539fe394e5ceb1d09007aa/jni>

Alternative: RenderScript <http://www.developer.com/ws/android/development-tools/writing-native-android-code-ndk-vs.-renderscript.html> TODO vs.

## samples

Samples under `ndk/samples/`. `hello-jni` is the most basic one.

Build as:

    # Tool present on the root of the NDK. Cross compiles to a ton of platforms.
    ndk-build
    # Create build.xml, as per: http://stackoverflow.com/questions/5572304/how-to-build-the-android-sample-projects-using-ant-build-xml-does-not-exist
    android update project -p . -t android-22
    ant clean
    ant debug
    ant installd
