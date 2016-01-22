# Android command

## Create a project template

<http://developer.android.com/tools/projects/projects-cmdline.html>
<http://stackoverflow.com/questions/20801042/how-to-create-android-project-with-gradle-from-command-line>
<http://stackoverflow.com/questions/17470831/how-to-use-gradle-to-generate-eclipse-and-intellij-project-files-for-android-pro>

    android create project \
        --target 1 \
        --name MyName \
        --path . \
        --activity MyActivity \
        --package com.cirosantilli.android_cheat

This template contains a `build.xml` which is used to configure the ant build system.
