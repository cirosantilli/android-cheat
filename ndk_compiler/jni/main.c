#include <stdio.h>

#include <jni.h>

jstring Java_com_cirosantilli_android_1cheat_ndk_1compiler_Main_jniMethod(
        JNIEnv* env, jobject thiz) {
    enum CONSTEXPR {N = 256};
    char s[N];
#ifdef __clang__
        snprintf(s, N, "%s", "clang" __clang_version__);
#else
# ifdef __GNUC__
        snprintf(s, N, "%s %d.%d.%d", "gcc", __GNUC__, __GNUC_MINOR__, __GNUC_PATCHLEVEL__);
# endif
#endif
    return (*env)->NewStringUTF(env, s);
}
