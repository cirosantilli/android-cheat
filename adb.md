# adb

Android Debug Bridge.

## Architecture

Three parts:

- client that runs on computer
- server that also runs on computer
- daemon that runs on cell phone

## Wireless

The most common way of using ADB on a device is to plug it in with an USB cable, but that is annoying, so:

- <http://stackoverflow.com/questions/2604727/how-can-i-connect-to-android-with-adb-over-tcp>
- <http://stackoverflow.com/questions/14358882/connecting-adb-using-wifi-for-non-rooted-device>

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

TODO: mention udev, device will ask for permission on screen. Then do:

      sudo "$(which adb)" kill-server
      sudo "$(which adb)" start-server

Install given apk to a device:

    adb install my.apk

Only works if there is a single device / emulator available.

Otherwise you have to specify a device with:

    adb -s emulator-5554 installd my.apk

The default generated `ant` file does this with `ant debug install`.

Install to all devices: <http://stackoverflow.com/questions/8610733/how-can-i-adb-install-an-apk-to-multiple-connected-devices>

## shell

TODO: is this the same as SSH? If not, how?

## push

Push file from local filesystem into device:

    adb push local_file /path/on/device/local_file

## pull

Contrary of `push`.

## reboot

    adb reboot bootloader
    adb reboot recovery

## sideload

TODO

## logcat

`tail -f` a huge log of all applications:


    adb logcat -g
    adb logcat

`cat` it instead of `tail -f`:

    adb logcat -d

TODO: what exactly goes to that log. That I know of:

- exception stack traces
- `Log()` calls

stdout is not logged: it requires a root-only hack it seems.

Output lines are of type:

    E/AndroidRuntime(15141)

Where:

- `E` is the log severity: here Error.
- `AndroidRuntime`: TODO: class name? Why does it show `AndroidRuntime` instead of my app?
- `15141`: TODO: PID?

### Severity

Show only errors:

    adb logcat '*:E'

Show only warnings and errors:

    adb logcat '*:W'

### v

<http://developer.android.com/tools/debugging/debugging-log.html#outputFormat>

Show everything:

    adb logcat -v long

Time:

    adb logcat -v time

### logcat size

It is a circular buffer:

- <http://stackoverflow.com/questions/6321555/what-is-the-size-limit-for-logcat>
- <http://stackoverflow.com/questions/8888654/android-set-max-length-of-logcat-messages>

Data is stored compressed in logcat, so you may get much more raw characters than that.

Can be obtained with:

    adb logcat -g

### r

### n

### How much data to print

TODO: what do those options mean?

    -r [<kbytes>]   Rotate log every kbytes. (16 if unspecified). Requires -f
    -n <count>      Sets max number of rotated logs to <count>, default 4

How to limit how many bytes?

This answer claims they require `-f`: <http://stackoverflow.com/questions/23425066/adb-logcat-f-log-txt-error-couldnt-open-output-file-read-only-file-system>

### f

Output to file instead of stdout.

But it seems that the file is inside the device, so you will likely get permission denied a lot: <http://stackoverflow.com/questions/23425066/adb-logcat-f-log-txt-error-couldnt-open-output-file-read-only-file-system>

### Filter logs for a single application

TODO: filter by a single application: <http://stackoverflow.com/questions/6854127/filter-logcat-to-get-only-the-messages-from-my-application-in-android>

The PID selection solution from <http://stackoverflow.com/a/9869609/895245> should work.

The easier way is to sort by tag of the `Log` class: <http://developer.android.com/reference/android/util/Log.html#d%28java.lang.String,%20java.lang.String%29>

### /system/bin/logcat

If you run that from `adb shell`, the output seems to be exactly the same.
