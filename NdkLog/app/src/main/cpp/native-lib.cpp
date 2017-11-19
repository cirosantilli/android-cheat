#include <android/log.h>
#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cirosantilli_android_1cheat_ndklog_MainActivity_stringFromJNI(
        JNIEnv* env, jobject thiz) {
    __android_log_write(ANDROID_LOG_DEBUG, "com.cirosantilli", "hello __android_log_write");
    return env->NewStringUTF("check logcat");
}
