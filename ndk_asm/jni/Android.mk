LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := main
LOCAL_SRC_FILES := main.c
# http://stackoverflow.com/questions/12614417/android-ndk-how-to-get-compiler-architecture-in-android-mk-dynamically
ifneq (,$(filter $(TARGET_ARCH_ABI),armeabi armeabi-v7a))
	LOCAL_SRC_FILES := $(LOCAL_SRC_FILES) main_asm.S
endif
include $(BUILD_SHARED_LIBRARY)
