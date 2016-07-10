# Bibliography

## Official

-   <http://developer.android.com/reference/packages.html>: API Javadoc

-   <http://tools.android.com/>

-   <https://source.android.com/>, specially:

    - <http://source.android.com/devices/index.html>
    - <http://source.android.com/security/index.html>

    which don't have to do about the source directly, but really how to use it.

-   <http://android-developers.blogspot.fr/>

## How to do vendor specific tasks for tons of models

- <http://www.hardreset.info/>

## Samples

Official:

-   <https://github.com/android/platform_development/tree/ndk-r12b/samples> *tons* of examples.

    - `ApiDemos`: simple API examples app, comes pre-installed on emulator images. But hard to get running... <https://android-review.googlesource.com/#/c/243350/>

-   <https://github.com/googlesamples?utf8=%E2%9C%93&query=android>

-   <https://github.com/googlesamples/android-architecture> complex app sample

-   `<sdk>/samples/android-XX` and <http://developer.android.com/samples/index.html>, TODO source?

    - `BasicMediaDecoder`: click play to show an `.mp4` H.264 / AAC video decoded on screen. The timing is horrible, with lots of breaks. And when the short video ends, an exception is raised.

-   `${ANDROID_SDK}/samples/android-XX`. Sample projects. Note that even in `android-XX`, you may need to install an older Android YY for them to work.

    Those projects are Gradle based, so you can either run them with with Android Studio or standard Gradle CLI commands.

    TODO: many sample apps fail to build with: "failed to find Build Tools revision 22.0.0". How to solve it?

    TODO: some apps die with "Unfortunately your app has stopped". On Android 22, camera apps failed.

    Many (all) of the samples can be found under: <https://github.com/googlesamples>, some grouped in a single repository, others in dedicated repositories, often of form 

        android-BasicManagedProfile

    GitHub presence is mentioned at <http://developer.android.com/samples/index.html>

Third-party:

-   <https://github.com/commonsguy/cw-omnibus>, by Android monster <http://stackoverflow.com/users/115145/commonsware>

-   <https://github.com/google/grafika> Android image / video manipulation. No JNI.

    More samples by the same ex Googler: <http://bigflake.com/mediacodec/>

-   <https://github.com/fyhertz/libstreaming-examples> Minuscule examples over a `MediaCodec` based library.

    Example 1 streams camera over a `RTSP` server, and can be viewed with VLC.
