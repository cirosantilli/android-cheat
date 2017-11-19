#include <jni.h>

#include "a.h"

jint Java_com_cirosantilli_android_1cheat_ndk_1two_1files_Main_jniMethod(
        JNIEnv* env, jobject thiz) {
    return getJint();
}
