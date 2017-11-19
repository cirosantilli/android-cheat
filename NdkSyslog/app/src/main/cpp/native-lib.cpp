#include <jni.h>
#include <string>
#include <syslog.h>


extern "C"
JNIEXPORT jstring JNICALL
Java_com_cirosantilli_android_1cheat_ndksyslog_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    syslog(LOG_CRIT, "hello syslog");
    return env->NewStringUTF("Check adb logcat");
}
