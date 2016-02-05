# Getting started

Step by step to get your first application up and running on the emulator and a real device.

## Install Android development tools

There is currently no package, it is a mess.

There is a Google Summer of Code 2015 project trying to solve that: <https://www.google-melange.com/gsoc/project/details/google/gsoc2015/seamlik/5707702298738688> See also:

- <http://askubuntu.com/questions/318246/complete-installation-guide-for-android-sdk-adt-bundle-on-ubuntu>
- <http://stackoverflow.com/questions/17963508/how-to-install-android-sdk-build-tools-on-the-command-line>
- <https://gist.github.com/wenzhixin/43cf3ce909c24948c6e7>

One the device:

- enable developer mode and USB debugging: http://www.syncios.com/blog/enable-developer-optionsusb-debugging-mode-on-devices-with-android-4-2-jelly-bean/
- link device to computer with USB cable

Then:

    sudo apt-get install ant gradle openjdk-7-jdk

    cd

    # Get device permissions.
    # MANUAL find vendor ID on this table: http://developer.android.com/tools/device.html#VendorIds
    VENDOR_ID='054c'
    UDEV_PATH='/etc/udev/rules.d/51-android.rules'
    echo 'SUBSYSTEM=="usb", ATTR'"$VENDOR_ID"'=="0bb4", MODE="0666", GROUP="plugdev"' | sudo tee "$UDEV_PATH"
    sudo chmod a+r "$UDEV_PATH"
    sudo /etc/init.d/udev restart
    sudo "$(which adb)" kill-server
    sudo "$(which adb)" start-server

    wget http://dl.google.com/android/android-sdk_r24.4.1-linux.tgz
    tar -xvf android-sdk_r24.4.1-linux.tgz

    # MANUAL run the ./tools/android GUI and install the SDK versions you need 
    # Better: just download EVERYTHING to save you annoyances later on.
    # Yes, it takes a ton of space (50Gib +).
    # TODO The automated command line should look something like:
    #./android update sdk -u -a -t 1

    # Studio
    wget https://dl.google.com/dl/android/studio/ide-zips/1.5.1.0/android-studio-ide-141.2456560-linux.zip
    unzip android-studio-ide-141.2456560-linux.zip
    cd android-studio/bin
    ./studio.sh

    # NDK
    wget http://dl.google.com/android/ndk/android-ndk-r10e-linux-x86_64.bin
    chmod a+x android-ndk-r10e-linux-x86_64.bin
    ./android-ndk-r10e-linux-x86_64.bin
    mv android-ndk-r10e android-ndk

Add to your `~/.profile`: TODO: which of those are actually necessary? Where are they documented.

    export ANDROID_SDK="$HOME/android-sdk"
    export ANDROID_HOME="$ANDROID_SDK"
    export ANDROID_NDK="$HOME/android-ndk"
    export ANDROID_NDK_ROOT="$ANDROID_NDK"
    export ANDROID_ABI='armeabi-v7a'
    export ANDROID_JAVA_HOME="$JAVA_HOME"
    export ANDROID_STUDIO="$HOME/android-studio/"
    export PATH="$ANDROID_SDK/platform-tools:$ANDROID_SDK/tools:${ANDROID_STUDIO}/bin:${ANDROID_NDK}:${PATH}"

## Run demos

Once you are setup, chose a project directory to run like `min` and:

    cd min
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
