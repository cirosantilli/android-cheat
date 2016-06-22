LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
APP_STL := stlport_static
NDK_TOOLCHAIN_VERSION := clang
LOCAL_MODULE := main
LOCAL_SRC_FILES := main.cpp
include $(BUILD_SHARED_LIBRARY)
