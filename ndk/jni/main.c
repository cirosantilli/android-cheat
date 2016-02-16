#include <jni.h>

jstring Java_com_cirosantilli_android_1cheat_ndk_Main_jniMethod(
        JNIEnv* env, jobject thiz) {
    return (*env)->NewStringUTF(env, "hello world");
}
