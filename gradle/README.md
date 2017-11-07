# Gradle

Pre-requisites:

- install Android Studio and the SDK
- ensure that `adb shell` works, i.e. you can connect with USB or TCP to a device or emulator instance

Build all examples, install them to the device, and run one of them:

    ./build -i
    ./run TextViewBold/

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

I got tired of fighting to minimize unminimizable Android Studio bloat of 20 million files to run a hello world program, and now just keep all the generated crap in the repo and be done with it. For most apps, please just ignore all files, and go straight for the `MainActivity.java`. Initial templates were obtained from Android Studio new projects, then similar ones forked with the `./template` script.

1.  [Getting started](getting-started.md)
1.  [Examples](examples.md)
    1.  [Default](default/)
    1.  UI
        1.  [XML layout](xml_layout/)
        1.  View
            1.  TextView
                1.  [TextViewNewlinew](TextViewNewlinew/)
                1.  [TextViewBold](TextViewBold/)
                1.  [TextView hyperlink](text_view_hyperlink/)
                1.  [ScrollView](scroll_view/)
                1.  [ScrollingMovementMethod](scrolling_movement_method/)
                1.  [EditText](edit_text/)
                    1.  [EditText.getText](edit_text_get_text/)
                1.  [Button](button/)
                    1.  [Checkbox](checkbox/)
                    1.  [RadioButton](radio_button/)
                1.  [setTextColor](set_text_color/)
            1.  [setBackgroundColor](set_background_color/)
            1.  [setLayoutParams](set_layout_params/)
                1.  [setLayoutParams LinearLayout](set_layout_params_linear_layout/)
            1.  ViewGroup
                1.  [RelativeLayout](relative_layout/)
                1.  [LinearLayout](linear_layout/)
            1.  Media
                1.  [ImageView](image_view/)
                    1.  [Bitmap](bitmap/)
                1.  [VideoView](video_view/)
            1.  Screen
                1.  [Fullscreen](fullscreen/)
                1.  [Portrait](portrait/)
        1.  Activities
            1.  [Two activities](two_activities/)
            1.  [Activity lifecycle](activity_lifecycle/)
            1.  [Change view](change_view/)
        1.  Notifications
            1.  [Notification](notification/)
            1.  [Toast](toast/)
            1.  [AlertDialog](alert_dialog/)
        1.  [Fragment](fragment/)
            1. TODO: more interesting multi-fragment example.
        1.  Hardware
    1.  [Background jobs theory](background-jobs.md)
        1.  [Handler](handler/)
        1.  [IntentService](intent_service/)
            1.  [IntentService TextView](intent_service_text_view/)
            1.  [IntentService start stop](intent_service_start_stop/)
        1.  [AsyncTask](async_task/)
    1.  [ServerSocket](server_socket/)
        1.  [Socket](socket/)
            1.  [Socket AsyncTask](socket_async_task/)
    1.  Hardware
        1.  [Camera](camera/)
            1.  [Camera one shot](camera_one_shot/)
            1.  [Camera preview video](camera_preview_video/)
    1.  [Location theory](location.md)
        1. [Location](location/)
    1.  [Pwd](Pwd/)
    1.  [Ndk](Ndk/)
        1.  [NDK ABI](ndk_abi/)
        1.  [NDK log](ndk_log/)
        1.  [NdkSyslog](NdkSyslog/)
        1.  [NDK two files](ndk_two_files/)
        1.  [NDK libc](ndk_libc/)
        1.  [NDK C++](ndk_cpp/)
        1.  [NDK asm](ndk_asm/)
        1.  [Native codec minimized](native_codec_minimized/)
