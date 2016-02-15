# Camera one shot

Expected outcome:

- when the app starts, a photo is immediately captured
- the app then displays that image

This implementation might be ugly because we're decoding with `BitmapFactory.decodeByteArray`. But that might actually be the raw input format, and this is OK?

- <http://stackoverflow.com/questions/20684553/how-can-i-enable-my-android-app-to-take-pictures-from-the-camera-without-preview>
- <http://stackoverflow.com/questions/9752730/take-a-photo-automatically-without-user-interaction>
- <http://stackoverflow.com/questions/23921128/take-a-picture-with-camera-and-get-bitmap>
- <http://stackoverflow.com/questions/14226531/what-format-is-for-android-camera-with-raw-picturecallback>

Adapted from: <http://stackoverflow.com/a/19781699/895245> which seems to be adapted from the official tutorial: <http://developer.android.com/guide/topics/media/camera.html>

This uses the Android 22 deprecated camera API.

On `AndroidManifest.xml`:

    <activity android:screenOrientation="landscape"

is required or else the app crashes.
