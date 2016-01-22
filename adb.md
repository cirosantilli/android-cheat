# adb

Android Debug Bridge.

## devices

List connected devices:

    adb devices -l

Sample output with an android

    List of devices attached
    BY900FBH2G             device usb:1-6 product:D6643 model:D6643 device:D6643

TODO: I think this also lists emulators. TODO check.

## install

TODO: mention udev, device will ask for permission on screen.

Install given apk to device.

    adb install bin/MyName-debug.apk

The default generated `ant` file does this with `ant debug install`.
