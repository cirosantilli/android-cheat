# NdkOpencl

Expected outcome: show `1` on a `TextView`.

This example cannot be automated because Google refuses to support OpenCL on Android officially.

However, many vendors do so anyways.

If your device does support OpenCL, you have to take the following steps:

-   download the OpenCL headers from: `https://github.com/KhronosGroup/OpenCL-Headers`. We've done that already and copy pasted them here inline. Should be fine, since this is part of the OpenCL standard, and will be compatible with every implementation.

-   get the `.so` from the device.

    The easiest way is to do:

        adb shell find / -iname "*libOpenCL.so*" 2> /dev/null
        adb pull /path/to/libOpenCL.so app/src/main/cpp/

-   in `NdkOpencl.off/app/build.gradle`, set the `ndkFilter` to match your ABI, since we are only providing the `.so` for a single arch: <https://stackoverflow.com/questions/33278152/gradle-build-ndk-target-only-arm/47558314#47558314>

TODO: get working on some specific device. Runtime failures so far.
