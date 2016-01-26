# Build

How to get and build android.

<https://source.android.com/source/downloading.html>

    curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
    chmod a+x ~/bin/repo
    mkdir android
    cd android
    repo init -u https://android.googlesource.com/platform/manifest
    # Get a great internet connection and free up 30GiB of disk, then:
    repo sync
    . build/envsetup.sh
    # Choose a target, e.g.:
    lunch aosp_arm-eng
    make
    # Wait a very long time.

TODO: get it running.

## lunch targets

`eng` suffix: http://stackoverflow.com/questions/13950589/difference-between-eng-and-user-debug-build-in-android
