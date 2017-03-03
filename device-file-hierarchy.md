# Device file hierarchy

How files are organized inside the Android device.

- <http://android.stackexchange.com/questions/46926/android-folder-hierarchy>
- <http://stackoverflow.com/questions/8268186/android-what-is-the-default-location-for-storing-images>
- <http://android.stackexchange.com/questions/27692/where-is-current-wallpaper-stored-on-jellybean>

## Internal storage

<http://stackoverflow.com/questions/25361238/difference-between-internal-sd-card-and-internal-storage>

The internal SD card is partitioned and mounted as follows:

-   `/system` is mounted readonly and is the ROM
    - `/system/bin`: system utilities, like `run-as`. You may not be able to run them without root.
-   `/sdcard` internal SD card. TODO check: mounted with `noexec`.
    - `/sdcard/Music` main music location. Apps will look there by default, but on other places as well. TODO API enforced, or just convention?
    - `/sdcard/Movies`
    - `/sdcard/Pictures` stock pictures
    - `/sdcard/Pictures/Screenshots`
    - `/sdcard/Ringtones`
    - Play Music location: <http://android.stackexchange.com/questions/16220/where-does-google-music-store-offline-songs>
-   `/data` is called "Internal storage", and contains apps and their data. <http://android.stackexchange.com/questions/3002/where-in-the-file-system-are-applications-installed>. TODO: example?
    - `/data/data` Contains directories of type: `com.firm.product`, which contain data for each app.
-   `/storage`
-   `/dev/log/main`: TODO is this where the logcat is stored?
