# Android Cheat

Minimal Android examples and demos.

Tested on Android 23, Ubuntu 15.10.

1.  [Getting started](getting-started.md)
1.  [Examples](examples.md)
    1.  [Default](default/)
    1.  [min](min/)
    1.  [Studio default](studio-default/)
    1.  UI
        1.  [XML layout](xml_layout/)
        1.  View
            1.  [TextView newline](text_view_newline/)
                1.  [TextView bold](text_view_bold/)
                1.  [TextView hyperlink](text_view_hyperlink/)
                1.  [ScrollView](scroll_view/)
                1.  [ScrollingMovementMethod](scrolling_movement_method/)
                1.  [EditText](edit_text/)
                    1.  [EditText.getText](edit_text_get_text/)
                1.  [Button](button/)
                    1.  [Checkbox](checkbox/)
                    1.  [RadioButton](radio_button/)
                1.  [setTextColor](set_text_color/)
            1.  [setBackgroundColor](set_background_color/)
            1.  [setLayoutParams](set_layout_params/)
                1.  [setLayoutParams LinearLayout](set_layout_params_linear_layout/)
            1.  ViewGroup
                1.  [RelativeLayout](relative_layout/)
                1.  [LinearLayout](linear_layout/)
            1.  Media
                1.  [ImageView](image_view/)
                    1.  [Bitmap](bitmap/)
                1.  [VideoView](video_view/)
            1.  Screen
                1.  [Fullscreen](fullscreen/)
                1.  [Portrait](portrait/)
        1.  Activities
            1.  [Two activities](two_activities/)
            1.  [Activity lifecycle](activity_lifecycle/)
            1.  [Change view](change_view/)
        1.  [Notification](notification/)
        1.  [Toast](toast/)
        1.  [Fragment](fragment/)
            1. TODO: more interesting multi-fragment example.
        1.  Hardware
    1.  [Background jobs](background-jobs.md)
        1.  [Handler](handler/)
        1.  [IntentService](intent_service/)
            1.  [IntentService TextView](intent_service_text_view/)
            1.  [IntentService start stop](intent_service_start_stop/)
    1.  Hardware
        1.  [Camera](camera/)
            1.  [Camera one shot](camera_one_shot/)
            1.  [Camera preview video](camera_preview_video/)
    1.  [Location theory](location.md)
        1. [Location](location/)
    1.  [NDK](ndk/)
        1.  [NDK ABI](ndk_abi/)
        1.  [NDK log](ndk_log/)
        1.  [Native codec minimized](native_codec_minimized/)
    1.  CLI device tools
        1.  [netcfg](netcfg.md)
        1.  [dumpsys](dumpsys.md)
        1.  getprop TODO
        1.  wm TODO
1.  Theory
    1.  [Root](root.md)
    1.  Development
        1.  [Build](build.md)
        1.  [Contribute to AOSP](contribute-to-aosp.md)
        1.  [Internals](internals.md)
            1.  [Device file hierarchy](device-file-hierarchy.md)
        1.  [android command](android-command.md)
        1.  [adb](adb.md)
            1.  [Project file hierarchy](project-file-hierarchy.md)
                1. [AndroidManifest.xml](android-manifest.md)
            1.  [ant](ant.md)
        1.  [Gradle](gradle.md)
        1.  [Apps](apps.md)
        1.  [SDK](sdk.md)
        1.  [aapt](aapt.md)
        1.  [Studio](studio.md)
    1.  [AOSP](aosp.md)
    1.  [Desktop](desktop.md)
        1. [POSIX](posix.md)
    1.  [Monitor app power consumption](monitor-app-power-consumption.md)
    1.  Mods
        1. [CyanogenMod](cyanogenmod.md)
        1. [AOKP](aokp.md)
    1.  [Google play](google-play.md)
    1.  [Open source](open-source.md)
    1.  [Trivia](trivia.md)
    1.  [GPU](gpu.md)
1.  Tools
    1. [template.sh](template.sh)
1.  Hardware
    1. [Fingerprint sensor](fingerprint-sensor.md)

## Chats

Mark all as read:

https://productforums.google.com/forum/#!topic/gmail/h-7PALCVZH0

## Gmail

Archive: swipe right

## Uninstallable apps

Some bloatware cannot be removed at all:

- <http://www.phonearena.com/news/Cant-uninstall-an-Android-app-This-could-be-your-problem_id61301>
- <http://forum.xda-developers.com/xperia-j-e/help/st26a-uninstall-uninstallable-apps-t2622293>
- <http://stackoverflow.com/questions/6415304/uninstallable-app-for-android>

## Bibliography

-   Android Authority
    - https://www.youtube.com/channel/UCgyqtNWZmIxTx3b6OxTSALw
-   https://en.wikipedia.org/wiki/XDA_Developers
    - http://www.xda-developers.com/

## Small apps

Stay on top of other apps.

Sample application: take screenshot!

- <https://developer.sony.com/develop/smartphones-and-tablets/camera-add-on-small-apps-or-ir-remote-apis/about/small-app-api/>
- <http://developer.sonymobile.com/2012/09/26/let-your-app-stay-on-top-with-small-apps-for-xperia-tablet-s/>

## Screenshot

On Xperia Z3, Power key + volume down.

## Icons

-   <http://android.stackexchange.com/questions/98975/complete-list-of-lollipop-system-icons-shown-in-notification-bar>
    - only network symbols: <http://android.stackexchange.com/questions/56269/what-are-the-different-signal-indicators-avalable-on-the-notification-bar>
-   4G vs H+ vs H
    - completely different WWAN standards: http://android.stackexchange.com/questions/56269/what-are-the-different-signal-indicators-avalable-on-the-notification-bar

## Add contact to home page

## Roaming

Little staircase symbol with an R on top: means that you are using paid data: <http://www.galaxys5manual.com/android-icons-meaning/>

The staircase icon shows the strength of the wide LAN.

Turn off: <http://www.gadgetdaily.xyz/quick-tip-how-to-turn-off-data-roaming-on-android/>

On 5.1, the "Mobile data" is also present on the default settings bar. It clearly explains that internet connection is gone unless you have Wifi.

## UI

### Status bar

Topmost bar on the screen, contains several icons like signal .

### Lock screen

What you see when you hit the power button.

### Lock screen widgets

Removed apparently in Android 5.

<http://www.androidauthority.com/lock-screen-widgets-android-lollipop-611516/>

### Toast

<http://www.mkyong.com/android/android-toast-example/>

## Notification history

- <http://android.stackexchange.com/questions/50177/android-4-3-how-to-get-the-notification-history>

## Notifications

### Transfer data to SD card notification

Disable:

- https://www.reddit.com/r/SonyXperia/comments/3101yj/how_do_i_disable_the_notification_transfer_data/
- https://talk.sonymobile.com/t5/Xperia-Z-ZL-ZR/Transfer-data-to-SD-card-notification/td-p/318761

### Application updated notification

Disable: <http://android.stackexchange.com/questions/58021/how-to-get-rid-of-update-notifications-for-a-given-app-in-google-play-store>

### New voicemail notification

Disable:

- <http://android.stackexchange.com/questions/60103/how-can-i-disable-voicemail-notifications>
- <http://forums.androidcentral.com/samsung-galaxy-s4/276901-there-way-turn-off-voicemail-notifications.html>

## Bloatware

Shitty software pre-installed by OEMs or carriers to get money from your personal information.

E.g., my Vivo (Brazilian carrier) + Sony Xperia Z3 has bloatware from both Vivo and Sony.

Apple forbids carriers from doing it it seems.

<http://www.greenbot.com/article/2920125/dear-carriers-please-stop-putting-bloatware-on-my-android-phone.html>

And on top of that, most bloatware cannot be uninstalled without rooting!!

### Skins

GUI changes made by OEMs or carriers to steal your data.

- Samsung: <https://en.wikipedia.org/wiki/TouchWiz>
- LG G UI
- HTC Sense UI
- Sony Xperia UI

### Stock device

No bloatware.

Near stock devices: <http://www.phonearena.com/news/Best-2015-smartphones-that-run-stock-or-near-stock-Android_id75780>

#### Google play edition

Certified near stock devices.

<https://en.wikipedia.org/wiki/List_of_Google_Play_edition_devices>

<http://arstechnica.com/gadgets/2015/01/dont-cry-for-the-google-play-edition-program-it-was-already-dead/>

Died.

#### Google Nexus

<https://en.wikipedia.org/wiki/Google_Nexus>

No bloatware phones.

Strategy:

- <https://www.quora.com/Why-doesnt-Google-start-manufacturing-phones>

### QR code scan

No built-in apparently:

- <http://www.pcadvisor.co.uk/how-to/google-android/how-scan-codes-with-your-smartphone-3513431/>
- <https://www.quora.com/Why-havent-Google-or-Apple-embedded-a-QR-reader-in-their-Camera-apps>
- <http://www.androidcentral.com/using-android-and-qr-codes>

### Panoramic photo

Was installed by default on 5.1.1 Xperia Z3 as a "camera app".

Open the camera, and search for it.

### App version

Find: <http://android.stackexchange.com/questions/2016/how-can-you-tell-which-version-of-an-app-is-on-your-android-phone/130407#130407>

## Linux file transfer

## Media transfer mode

## Mass storage mode

- <http://askubuntu.com/questions/189591/connecting-android-4ice-cream-sandwich-jelly-bean-kitkat-phone>
- <http://askubuntu.com/questions/199280/how-to-install-pc-companion-software-of-sony-xperia>
- <http://android.stackexchange.com/questions/66385/how-to-transfer-files-from-an-android-phone-to-a-ubuntu-pc-by-using-a-usb-cable>
- <http://android.stackexchange.com/questions/91900/is-there-a-viable-alternative-to-mtp-for-file-transfer?lq=1>

SSH method working: http://askubuntu.com/questions/189591/connecting-android-4ice-cream-sandwich-jelly-bean-kitkat-phone#comment1035980_222851

## App isolation

Each App runs under a different UID: <http://security.stackexchange.com/questions/67188/android-app-isolation-risks-implementation> So it just reuses Linux's security.

## HTML GUI

<http://stackoverflow.com/questions/9045355/how-to-create-an-android-app-using-html-5>
<http://developer.android.com/guide/webapps/index.html>

Android uses it's custom GUI API. Some day, maybe.

### APK

Packaging format for android apps.

#### Aligned vs unaligned

<http://stackoverflow.com/questions/22058210/why-unaligned-apk-is-needed>

### AOKP

https://en.wikipedia.org/wiki/AOKP

http://android.stackexchange.com/questions/50491/what-is-the-difference-between-aosp-and-aokp

### ODEX

### Optimizing apps

### Dalvik cache

- <https://www.quora.com/What-is-Android-doing-when-after-an-upgrade-it-tells-you-its-optimizing-the-apps>
- <http://stackoverflow.com/questions/7541281/what-is-dalvik-and-dalvik-cache>
- <https://en.wikipedia.org/wiki/Dalvik_%28software%29>

Replaced by ART in Android 5.

### ART

Successor of Dalvik.

No JIT, full AOT is done.

### x86

- <http://stackoverflow.com/questions/17770907/is-android-os-only-used-for-arm-cpus>
- <http://www.android-x86.org/>

    TODO: linked to the Intel partnership? Or that one is yet to be released?

### Java 8

Nope: <http://stackoverflow.com/questions/23318109/is-it-possible-to-use-java-8-for-android-development>

### libc

Bionic, Google-made.

### ROM

Read only memory.

Stores the OS.

Mounted under `/system`

If you root the device, you can change it, and make a custom Android however you like.

<https://www.youtube.com/watch?v=RIi4KXgZYsI&feature=iv&src_vid=AWNykj-lb-I&annotation_id=annotation_162326159>

### Installed PATH utilities

- <http://android.stackexchange.com/questions/2149/where-can-i-find-documentation-for-shell-commands>
- <http://stackoverflow.com/questions/13619993/available-linux-commands-across-android-versions>
- <http://android.stackexchange.com/questions/4021/how-can-i-execute-command-in-the-terminal-as-root>

Undocumented? Great.

### USB debugging mode

TODO? What is that?

Enabled from Developer options

Disable the eternal notification: <http://android.stackexchange.com/questions/5075/how-do-i-disable-the-usb-connected-notification>

### Tether

<https://en.wikipedia.org/wiki/Tethering>

Requires root, but available on Google Store.

Carriers may require you to pay for that if you tether from their network instead of LAN, which is why Android disables it by default.

Root allows you to re-enable that.

### HBOOT

The Android bootloader?

- <http://android.stackexchange.com/questions/27920/what-does-hboot-mean>

## Smart lock

Unlock in some cases without a password.

On-body detection: <http://www.androidcentral.com/body-detection-explained> Uses accelerometer.

Known WIFI not available it seems:

- <https://www.reddit.com/r/Android/comments/2pyyk5/smartlock_request_wifi_please_googs/>

## Piracy

- <http://www.businessinsider.com/android-piracy-problem-2015-1>

## Soft reset vs reboot

TODO?

- <https://www.reddit.com/r/xposed/comments/215ord/what_is_the_difference_between_reboot_and_soft/>
- <http://android.stackexchange.com/questions/123905/what-is-the-difference-between-temp-root-pemanent-root-what-is-a-soft-reboot>

Apparently soft rest is more superficial, and thus faster, but solves less problems.

## Sony Xperia

### Xperia Home

Reset home screen to device default:

    Settings -> Apps -> All -> Xperia Home -> Clear data -> OK.

## Do not disturb

## Silent mode

## Blocking mode

TODO where is it?? How to turn it on?

## Linux run Android app natively

- <http://thenextweb.com/google/2015/04/02/google-releases-a-tool-for-developers-to-launch-android-apps-on-windows-mac-linux-and-chrome-os/>
- <https://www.linux.com/learn/tutorials/842630-installing-android-apps-on-linux-with-archon>
- <https://www.maketecheasier.com/running-android-apps-on-linux/>

## Peripherals

- joystick root calibration method <https://www.youtube.com/watch?v=GwrGpVquGyo>

## aar

## Android library project

<http://stackoverflow.com/questions/23915619/android-archive-library-aar-vs-standard-jar>

## fugu

<http://www.androidpolice.com/2014/11/05/the-nexus-player-fugu-initial-android-5-0-factory-image-and-binaries-are-ready-to-download-now/>

## Screen pinning

<http://www.cnet.com/how-to/ho-to-pin-apps-in-android-5-lollipop/>

## Phone without battery

If you link USB power cables directly to the battery energy entry points, it works: <https://www.youtube.com/watch?v=f0IuBld2lzA>

## Secret codes

<http://android.stackexchange.com/questions/35758/how-to-view-the-android-service-menu-secret-menu>

Vary with Model, OEM and Carrier. TODO: are any built into the core?

## Hardware

<http://developer.android.com/guide/topics/sensors/sensors_environment.html>
