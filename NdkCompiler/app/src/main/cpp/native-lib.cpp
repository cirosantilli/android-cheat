#include <sstream> // stringstream

#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cirosantilli_android_1cheat_ndkcompiler_MainActivity_stringFromJNI(
        JNIEnv* env, jobject /* this */) {
	std::ostringstream ss;
#ifdef __clang__
        ss << "clang " <<  __clang_version__;
#else
# ifdef __GNUC__
        ss << "gcc " <<  __GNUC__ << " " << __GNUC_MINOR__ << " " << __GNUC_PATCHLEVEL__;
# endif
#endif
    return env->NewStringUTF(ss.str().c_str());
}
