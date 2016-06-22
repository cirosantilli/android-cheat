LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
# Latest clang.
#NDK_TOOLCHAIN_VERSION := clang
# Weirdly uses clang3.8.
#NDK_TOOLCHAIN_VERSION := clang3.6
# Fixed GCC.
#NDK_TOOLCHAIN_VERSION := 4.9
# Fail.
#NDK_TOOLCHAIN_VERSION := clang3.8
#NDK_TOOLCHAIN_VERSION := gcc
LOCAL_MODULE := main
LOCAL_SRC_FILES := main.c
include $(BUILD_SHARED_LIBRARY)
