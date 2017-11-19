# Getting started

- install Android Studio and the SDK
- ensure that `adb shell` works, i.e. you can connect with USB or TCP to a device or emulator instance

Build all examples, install them to the device, and run one of them:

    ./configure
    ./build -i
    ./run TextViewBold/

If one of the builds fail, open the app on Android Studio, hit the build button, then accept whatever crappy automatic fixes it proposes, until you can build and run that example. Then try our build script again, and iterate until they all build. Yes, Android automation sucks and there is nothing you can do about it.

Build one example, install it to the device, and run it:

    ./build -i TextViewBold/
    ./run TextViewBold/

or equivalently:

    ./build -i -r TextViewBold/

Uninstall all examples from the device:

    ./build -u

Start a new project from the boilerplate of an existing one:

    ./template NewTextViewBold TextViewBold/
    ./build -i -r NewTextViewBold/

I'm a newb and I want to edit the project with Android Studio instead of Vim:

- launch IDE
- "Open an existing Android Studio project"
- select a directory

I once had a dream to have one git tracked file per app, but I got tired of fighting to minimize unminimizable Android Studio bloat of 20 million files to run a hello world program, and now just keep all the generated crap in the repo and be done with it. For most apps, please just ignore all files, and go straight for the `MainActivity.java`. Initial templates were obtained from Android Studio new projects, then similar ones forked with the `./template` script.
