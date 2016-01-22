# adb

Android Debug Bridge.

## devices

List connected devices:

    adb devices -l

Sample output with an enabled physical Android device and an emulator running:

    List of devices attached
    BY900FBH2G             device usb:1-6 product:D6643 model:D6643 device:D6643
    emulator-5554          device product:sdk_google_phone_x86 model:Android_SDK_built_for_x86 device:generic_x86

The first column can be used as an identifier to the `adb` command, e.g. `adb -s emulator-5554 install my.apk`.

TODO: I think this also lists emulators. TODO check.

## install

TODO: mention udev, device will ask for permission on screen.

Install given apk to a device:

    adb install my.apk

Only works if there is a single device / emulator available.

Otherwise you have to specify a device with:

    adb -s emulator-5554 installd my.apk

The default generated `ant` file does this with `ant debug install`.

<http://stackoverflow.com/questions/4974568/how-do-i-launch-the-android-emulator-from-the-command-line>
