# Internals

Find Linux kernel version:

- Found on About phone: <https://www.quora.com/What-does-kernel-version-mean-and-why-is-the-Android-version-and-the-kernel-version-different>
- big list: <http://android.stackexchange.com/questions/51651/which-android-runs-which-linux-kernel> but it was wrong according to my about phone

Usage data: <https://en.wikipedia.org/wiki/Android_version_history#/media/File:Android_historical_version_distribution_-_vector.svg>

Bugs and feature requests: <https://code.google.com/p/android/issues/list>

Pull requests: <https://android-review.googlesource.com> (uses Gerrit which was created for Android)

Browse source: <https://android.googlesource.com/> (uses gitiles, apparently also created for Android?)

## Supported architectures

- ARM
- x86
- MIPS. See also: <http://www.androidauthority.com/nintendo-64-android-l-microcontrollers-story-mips-538596/>

## App isolation

Each app runs as a different user.

This implies that each app runs on a different Dalvik VM: <http://android.stackexchange.com/questions/42129/why-each-android-application-runs-on-a-different-dalvik-vm-process>
