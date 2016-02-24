# Native Codec Minimized

Same as <https://github.com/googlesamples/android-ndk/tree/e3721c897dc0326920cbd3313127f921f3cbabc5/native-codec> but the Java part is minimized: no more texture and no XML.

Expected outcome: a minimal video player, with a play / pause and a rewind button.

You still need to download the video: <https://raw.githubusercontent.com/googlesamples/android-ndk/e3721c897dc0326920cbd3313127f921f3cbabc5/native-codec/testfile.mp4> and:

    adb push testfile.mp4 /sdcard/testfile.mp4

TODO: remove that download requirement. Either embed the file under `res/`, or generate one programmatically.

TODO: change orientation breaks the video.
