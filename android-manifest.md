# Android manifest

Set name and icon that show on home screen icon:

    <application android:label="@string/app_name" android:icon="@drawable/ic_launcher">

Main class that will be run:

    <activity android:name="AndroidCheatDefault"

Dot in the name:

    <activity android:name=".HelloJni">

<http://stackoverflow.com/questions/4834122/whats-the-dot-for-when-registering-an-activity>

Should be inside the `package` specified at:

    <manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.cirosantilli.android_cheat.default_template"
        android:versionCode="1"
        android:versionName="1.0">
