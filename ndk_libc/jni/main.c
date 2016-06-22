#define _XOPEN_SOURCE 700
#include <stdlib.h> /* exit */
#include <strings.h> /* ffs */
#include <math.h> /* sqrt, fabs */

#include <jni.h>

const static float ERR  = 1e-6;

jint Java_com_cirosantilli_android_1cheat_ndk_1libc_Main_jniMethod(
        JNIEnv* env, jobject thiz) {

    int err = 0;

    /* exit system call works and does not seem to raise any exceptions. The app closes. */
    /*exit(0);*/

    /* Math library. */
    err |= (fabs(sqrt(4.0) - 2.0) > ERR);

    /* POSIX extension. */
    err |= (ffs(2) != 2);

    return err;
}
