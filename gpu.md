# GPU

## MediaCodec

<http://developer.android.com/reference/android/media/MediaCodec.html>

Public API to do heterogeneous video decoding. Yes, many GPUs do video compression on silicon.

## RenderScript

The official OpenCL for Android: <http://stackoverflow.com/questions/14385843/why-did-google-choose-renderscript-instead-of-opencl>

## OpenCL

Google shunned it for RenderScript.

Intel pushes it though:

- <https://software.intel.com/en-us/android/articles/opencl-basic-sample-for-android-os>
- <https://software.intel.com/sites/default/files/managed/d3/18/AndroidBasicOpenCL.pdf>

## OpenGL

OpenGL ES is supported.

Can be done entirely from a Java API, no need for NDK. But can also be done with NDK if you want.

- <http://stackoverflow.com/questions/8578002/android-tutorials-for-opengl-es-2-0-using-the-ndk>
- <http://stackoverflow.com/questions/3562953/opengl-es-2-0-possible-without-ndk>

Examples:

- a few under SDK `android-23/media/MediaEffects`
- <https://github.com/ldo/gles2_sample_android>

## Vulkan

Looks C++ only?

- <https://github.com/googlesamples/android-vulkan-tutorials>
- <http://arstechnica.com/gadgets/2015/08/android-to-support-vulkan-graphics-api-the-open-answer-to-metal-and-dx12/>

TODO: supported or not?
