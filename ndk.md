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

NDK updates don't come out together with the newest SDK! E.g., at some point there was SDK 23, but only NDK 21:

- <https://groups.google.com/forum/#!topic/android-ndk/5yBELmoFAYg>
- <https://groups.google.com/forum/#!topic/android-ndk/UZVjlTi_3qo>

TODO:

- check NDK toolkit version. I think visible under `cat source.properties`
- check NDK version that a device supports <http://stackoverflow.com/questions/21876813/how-to-retrieve-the-supported-android-jni-version-in-a-device>

## samples

Samples previously under `$ANDROID_NDK/samples/`, now seem to be removed to <https://github.com/googlesamples/android-ndk>?

`hello-jni` is the most basic one

Build as:

    # Tool present on the root of the NDK. Cross compiles to a ton of platforms.
    ndk-build
    # Create build.xml, as per: http://stackoverflow.com/questions/5572304/how-to-build-the-android-sample-projects-using-ant-build-xml-does-not-exist
    android update project -p . -t android-22
    ant clean
    ant debug
    ant installd

## Build system

## Application.mk

## Android.mk

In the past, NDK used Makefiles.

As of 2016 the NDK examples are moving to pure Gradle.

Useful options:

    LOCAL_CFLAGS := -Werror
    LOCAL_LDLIBS := -llog -lGLESv2

## NDK source tree

- `toolchains`: several build cross compilers, GCC and clang. Those can be used without an Android app: <http://developer.android.com/ndk/guides/standalone_toolchain.html>
- `platforms/`: headers and compiled libraries that you can use inside Android.

## Compiler

<http://stackoverflow.com/questions/6602929/which-compiler-does-android-ndk-use>

Moved to clang from GCC in 2015:

- <https://android.googlesource.com/platform/ndk.git/+/master/CHANGELOG.md>
- <https://news.ycombinator.com/item?id=10772826>

## ndk-build

Script that wraps make.

Location: `<ndk>/ndk-build`.

Show compilation commands:

    ndk-build V=1

The move to Gradle removes the need for it.

Clean:

    ndk-build clean

## ndk-gdb

<http://stackoverflow.com/questions/10534367/how-to-get-ndk-gdb-working-on-android>

## Compile executable without app

Supported: <http://developer.android.com/ndk/guides/standalone_toolchain.html>

    "$ANDROID_NDK/toolchains/arm-linux-androideabi-4.9/prebuilt/linux-x86_64/bin/arm-linux-androideabi-gcc-4.9" \
        --sysroot="$ANDROID_NDK/platforms/android-21/arch-arm" \
        hello_world.c -o hello_world
    # /tmp is required...
    adb push hello_world /data/local/tmp/hello_world
    adb shell /data/local/tmp/hello_world

TODO: I get <http://stackoverflow.com/questions/24818902/running-a-native-library-on-android-l-error-only-position-independent-executab>

Adding `-fPIE -fpie` to the `gcc` command did not help.

Threads:

- <http://stackoverflow.com/questions/9868309/how-can-i-run-c-binary-executable-file-in-android-from-android-shell>
- <http://stackoverflow.com/questions/13690419/writeable-and-executable-location-on-android>
- <http://android.stackexchange.com/questions/45554/running-own-executable-on-android-shell>
- <http://stackoverflow.com/questions/17383552/how-to-package-native-commandline-application-in-apk>
- <http://stackoverflow.com/questions/6168303/compiling-c-code-netcat-to-native-android-executable>
