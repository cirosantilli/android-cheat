# Versions

Compatible platform versions are specified as a range under `AndroidManifest.xml`.

<https://developer.android.com/training/basics/supporting-devices/platforms.html#sdk-versions>

TODO: if you compile with a platform with level 23, can that run on a device with with level 22?

## API level

<https://en.wikipedia.org/wiki/Android_version_history>

<http://stackoverflow.com/questions/8629687/android-api-level-vs-android-versionvuj>

TODO: API level vs version, e.g. 6.0 vs version 23?

## Update

It seems that it is the OEM that decides when to update and you can't do anything easily about it: <http://www.trustedreviews.com/opinions/android-6-0-marshmallow-update>

This is called an Over the Air (OTA) upgrade. This looks like a generic term, not an specific standard: <https://en.wikipedia.org/wiki/Over-the-air_programming>

TODO what is the alternative to OTA? Flashing a new ROM?

You can check if a new one is available now under: Phone > Settings > Software update > System , but you usually get a notification saying so.

### Usage statistics

- history until 2015: <http://blog.davidecoppola.com/2015/03/android-version-distribution-over-time-march-2015-update/>
- 2015: <http://www.androidauthority.com/android-distribution-august-2015-631077/>

## Utility replacements

- `ifconfig`: `netcfg` + `ifconfig`
- `env`: `printenv`
