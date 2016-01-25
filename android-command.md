# Android command

Located under `$ANDROID_SDK/tools/android`.

## create project

<http://developer.android.com/tools/projects/projects-cmdline.html>

    android create project \
        --target 1 \
        --name MyName \
        --path . \
        --activity MyActivity \
        --package com.cirosantilli.android_cheat \
        -g

This template contains a `build.xml` which is used to configure the ant build system.

`--name` goes to `build.xml`.

    <project name="MyName" default="help">

`--package` says in which directory it will be installed. This seems to be the only think that determines which app is which. If you install a second app with the same package, it overrides the old one.

## gradle

`--gradle`: TODO. Requires a "Gradle template". Where can I find that?

- <http://stackoverflow.com/questions/20801042/how-to-create-android-project-with-gradle-from-command-line>
- <http://stackoverflow.com/questions/17470831/how-to-use-gradle-to-generate-eclipse-and-intellij-project-files-for-android-pro>

Looks like they can be found under: `tools/templates/gradle`

## avd

Android Virtual Devices. Manage emulators.

If you have a real device, just use it instead. It is runs faster, and is more accurate, and the install time is not larger. Use emulators only for devices you don't own.

GUI:

    android avd

Allows to create and start emulators.

Enable hardware keyboard: <http://stackoverflow.com/questions/11235370/android-emulator-doesnt-take-keyboard-input-sdk-tools-rev-20>

TODO: from command line:

- start VM
- install VM
