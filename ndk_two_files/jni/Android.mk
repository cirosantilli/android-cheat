LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := main
LOCAL_SRC_FILES := main.c a.c
LOCAL_C_INCLUDES := a.h
include $(BUILD_SHARED_LIBRARY)
