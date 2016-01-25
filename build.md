# Build

How to get and build android.

<https://source.android.com/source/downloading.html>

    curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
    chmod a+x ~/bin/repo
    mkdir android
    cd android
    repo init -u https://android.googlesource.com/platform/manifest
