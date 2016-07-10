# Emulator

If you have a real device, just use it instead. It is runs faster, and is more accurate, and the install time is not larger. Use emulators only for devices you don't own.

Official emulator based on QEMU: <http://stackoverflow.com/questions/2598942/android-emulator-is-based-on-qemu-can-i-use-kvm-with-it>

The x86 images may use hardware acceleration on x86 dev machines: <http://stackoverflow.com/questions/23416448/difference-between-google-apis-x86-system-image-and-google-apis-arm-system-im>

You need a reasonably powerful computer to run the more modern devices. Consider emulating the older ones, like Nexus One instead. The emulator can still run modern Android APIs on them.

Enable hardware keyboard: <http://stackoverflow.com/questions/11235370/android-emulator-doesnt-take-keyboard-input-sdk-tools-rev-20>

## AVD

First you must create the `AVD` file, which describes android devices, and the template can only be done from Android Studio:

    Tools > Android > AVD Manager

AVDs are stored under:

    ls ~/.android/avd/

by Android Studio.

## CLI usage

<https://developer.android.com/studio/run/emulator-commandline.html>

CLI wrapper under:

    ${ANDROID_SDK}/tools/emulator

List created AVDs:

    emulator -list-avds

Start an AVD:

    emulator -avd Nexus_One_API_24

## Genymotion

Third party emulator.

Comparison: <http://stackoverflow.com/questions/18683656/android-genymotion-vs-emulator>

## SIM card

Use SIM card on emulator:

- real: <https://simhacks.github.io/android-emulator/>
- emulated: <http://stackoverflow.com/questions/6942605/how-to-simulate-a-sim-card-for-android>
