# Getting started

1. 	Install the SDK and NDK: <http://askubuntu.com/questions/318246/complete-installation-guide-for-android-sdk-adt-bundle-on-ubuntu/732010#732010>

1.	Run once after cloning:

		./configure

1.	Build demo app:

		cd appdir/
		# If project uses NDK.
		ndk-build
		ant clean
		ant debug

1. 	To install a built app, connect your device via USB and run:

        ant installd

    No home icon is created by default: you have to find it on the list of recently installed apps.

    App names are of form:

        AndroidCheatAppName

1. 	Uninstall app:

		ant uninstall

1.	Build all apps without installing:

		./build-all

1.	Build all and install them:

		./build-all -i

1. 	Uninstall all:

		./build-all -u

## Launch app automatically

This function makes the app launch automatically for most apps in this repository.

Only one device / emulator must be connected.

    adb-run() (
      cd 'src/'
      file="$(find * -type f | head -n1)"
      dir="$(dirname "$file")"
      file="$(echo "$file" | sed -r 's/.java$//' | tr '/' '.')"
      dir="$(echo "$dir" | tr '/' '.')"
      adb shell am start -n "${dir}/${file}"
    )

Now you can `cd` into the top-level of a built app, and do:

	adb-run

and the device should launch the application.
