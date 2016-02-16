#include <android/log.h>
#include <jni.h>

void Java_com_cirosantilli_android_1cheat_ndk_1log_Main_jniMethod(
        JNIEnv* env, jobject thiz) {
    __android_log_write(ANDROID_LOG_DEBUG, "com.cirosantilli", "hello world");
}
