#include <stdio.h>

#include <jni.h>

#ifdef __arm__
/* Warning: not supported. */
/*int asm_main(void) __attribute__((target("arm")));*/
int asm_main(void);
#endif

jstring Java_com_cirosantilli_android_1cheat_ndk_1asm_Main_jniMethod(
        JNIEnv* env, jobject thiz) {
    enum Constexpr { N = 256 };
    char s[N];
    size_t cur = 0;

    int x = 0;
#ifdef __arm__
    cur += snprintf(s + cur, N - cur, "arm ");
    /* Inline test. */
    asm (
        "add %0, #1"
        : "=r" (x)
        : "0" (x)
    );
    x += asm_main();
#endif
    if (x == 2)
        cur += snprintf(s + cur, N - cur, "%s", "0");
    else
        cur += snprintf(s + cur, N - cur, "%s", "1");

    return (*env)->NewStringUTF(env, s);
}
