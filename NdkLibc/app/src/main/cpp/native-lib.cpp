#include <cmath> // sqrt
#include <sstream> // stringstream

#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cirosantilli_android_1cheat_ndklibc_MainActivity_stringFromJNI(
        JNIEnv* env, jobject /* thiz */) {
	std::ostringstream ss;
	ss << "sqrt(4.0) = ";
	ss << std::sqrt(4.0);
    return env->NewStringUTF(ss.str().c_str());
}
