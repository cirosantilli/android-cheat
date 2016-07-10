# GPU

## OpenGL

OpenGL ES is supported.

Can be done entirely from a Java API, no need for NDK. But can also be done with NDK if you want.

- <http://stackoverflow.com/questions/8578002/android-tutorials-for-opengl-es-2-0-using-the-ndk>
- <http://stackoverflow.com/questions/3562953/opengl-es-2-0-possible-without-ndk>

Examples:

- <https://github.com/ldo/gles2_sample_android>

Not based on JOGL apparently, but JOGL also supports Android:

- <http://stackoverflow.com/questions/34846779/is-there-an-android-implementation-of-jogls-gl2es2>
- <http://stackoverflow.com/questions/27087504/jogl-vs-opengl-es-api-on-android-proscons>

## Vulkan

Looks like C++ only?

Samples:

- <https://github.com/googlesamples/android-vulkan-tutorials>, fails with:
    - <https://github.com/googlesamples/android-vulkan-tutorials/issues/11> <http://stackoverflow.com/questions/35937530/android-studio-2-1-preview-failing-to-find-target-with-hash-string-android-n>
    - and then <https://github.com/googlesamples/android-vulkan-tutorials/issues/13>
- <https://github.com/googlesamples/vulkan-basic-samples/> port of <https://github.com/LunarG/VulkanSamples>, available from Android Studio, but import did not work last time I tried... 

Hardware support:

- <http://arstechnica.com/gadgets/2015/08/android-to-support-vulkan-graphics-api-the-open-answer-to-metal-and-dx12/>

TODO: supported or not?

## RenderScript

The official OpenCL for Android: <http://stackoverflow.com/questions/14385843/why-did-google-choose-renderscript-instead-of-opencl>

## OpenCL

Google shunned it for RenderScript.

Intel pushes it though:

- <https://software.intel.com/en-us/android/articles/opencl-basic-sample-for-android-os>
- <https://software.intel.com/sites/default/files/managed/d3/18/AndroidBasicOpenCL.pdf>

## MediaCodec

API for Video and Audio hardware acceleration. Yes, many GPUs / SoCs do video compression on silicon.

<http://developer.android.com/reference/android/media/MediaCodec.html>

Examples:

- a few under SDK `samples/android-23/media`
