#include <sstream> // stringstream

#include "a.hpp"

#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cirosantilli_android_1cheat_ndktwofiles_MainActivity_stringFromJNI(
        JNIEnv* env, jobject /* this */) {
	std::ostringstream ss;
	ss << getInt();
    return env->NewStringUTF(ss.str().c_str());
}
