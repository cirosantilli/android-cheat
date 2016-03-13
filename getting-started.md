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

1. 	Install individual built demo app:

		ant installd

1. 	Uninstall app:

		ant uninstall

1.	Build all without installing:

		./build-all`

1.	Build all and install them:

		./build-all -i

1. 	Uninstall all:

		./build-all -u

## Run demos

Once you are setup, chose a project directory to run like `min` and:

Now open your device and launch the app. No home icon is created by default.

### Launch app automatically

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
