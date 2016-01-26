# Android command

Located under `$ANDROID_SDK/tools/android`.

## create project

<http://developer.android.com/tools/projects/projects-cmdline.html>

    android create project \
        --activity MyActivity \
        --name MyName \
        --package com.cirosantilli.android_cheat \
        --path . \
        --target 1

This template contains a `build.xml` which is used to configure the ant build system.

`--name` goes to `build.xml`.

    <project name="MyName" default="help">

`--package` says in which directory it will be installed. This seems to be the only think that determines which app is which. If you install a second app with the same package, it overrides the old one.

## gradle

To create a project with a `gradlew`  se `--gradle` and `--gradle-version` as mentioned at <http://stackoverflow.com/questions/20801042/how-to-create-android-project-with-gradle-from-command-line>:

    android create project \
        --activity MyActivity \
        --gradle \
        --gradle-version 2.8 \
        --name MyName \
        --package com.cirosantilli.android_cheat \
        --path . \
        --target 1

TODO: how to build that project? Getting:

    FAILURE: Build failed with an exception.

    * What went wrong:
    A problem occurred configuring root project 'gradle'.
    > Could not resolve all dependencies for configuration ':classpath'.
       > Could not find com.android.tools.build:gradle:2.8.
         Required by:
             :gradle:unspecified

<http://stackoverflow.com/questions/16619773/failed-to-import-new-gradle-project-failed-to-find-build-tools-revision-0-0>

Looks like this template can be found under: `tools/templates/gradle`

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

Use SIM card on emulator:

- real: <https://simhacks.github.io/android-emulator/>
- emulated: <http://stackoverflow.com/questions/6942605/how-to-simulate-a-sim-card-for-android>
