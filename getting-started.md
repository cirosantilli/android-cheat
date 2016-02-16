# Getting started

Step by step to get your first application up and running on the emulator and a real device.

## Install Android development tools

<http://askubuntu.com/questions/318246/complete-installation-guide-for-android-sdk-adt-bundle-on-ubuntu/732010#732010>

Then:

- copy paste to satisfy all symlinks under `min/libs`
- the required files / directories will be under `<sdk>/extras`, use `find` or `locate`
- for the directories, `cd` into them, and run `android update project -p . -t android-22`
- yes, this is a horrible step, but we don't have a much better solution yet

## Run demos

Once you are setup, chose a project directory to run like `min` and:

    cd min
    # If project uses NDK.
    ndk-build
    ant clean
    ant debug
    ant installd

Now open your device and launch the app. No home icon is created by default.

For simple one file projects like most of the examples here, you can automate the launching with:

    adbr() (
      cd 'src/'
      file="$(find * -type f | head -n1)"
      dir="$(dirname "$file")"
      file="$(echo "$file" | sed -r 's/.java$//' | tr '/' '.')"
      dir="$(echo "$dir" | tr '/' '.')"
      adb shell am start -n "${dir}/${file}"
    )
