//#include <string>

#include <jni.h>

extern "C" {
    JNIEXPORT jstring JNICALL Java_com_cirosantilli_android_1cheat_ndk_1cpp_Main_jniMethod(
            JNIEnv*, jobject);
}

JNIEXPORT jstring JNICALL Java_com_cirosantilli_android_1cheat_ndk_1cpp_Main_jniMethod(
        JNIEnv* env, jobject thiz) {
    //std::string s1 = "hello ";
    //std::string s2 = "world";
    //std::string s3 = s1 + s2;
    //return env->NewStringUTF(s3.to_chr());
    // TODO env is different here than for C. Why?
    return env->NewStringUTF("Hello World JNI!");
}
