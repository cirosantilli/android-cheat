# NDK

Minimized version of `$ANDROID_NDK/samples/hello-jni`.

Build with:

    ndk-build
    ant clean
    ant debug
    ant installd

TODO: I was not able to call my package `android_cheat` because of the underscore, even if I try to use the `_1` rule: <http://stackoverflow.com/questions/16069209/invoking-jni-functions-in-android-package-name-containing-underscore>
