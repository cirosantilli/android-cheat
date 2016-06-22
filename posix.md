# POSIX

## C API

About C API, not sure:

- <http://stackoverflow.com/questions/12111640/android-ndk-and-posix-functions>
- <http://stackoverflow.com/questions/12111640/what-are-the-most-important-posix-functions-not-available-in-android>
- <http://stackoverflow.com/questions/27604455/is-android-posix-compatible>
- <http://unix.stackexchange.com/questions/146971/is-android-compatible-with-the-linux-standard-base>

TODO can you use the entire bionic API directly with NDK? How much does it implement?

TODO is Bionic also code-dropped with the rest of Android?

## CLI utilities

It does not have many CLI utilities, e.g. `cal`.

There is a BusyBox for Android however: <https://play.google.com/store/apps/details?id=stericson.busybox&hl=en> But it requires root.

Most utilities are under `/system/bin`

Google seems to prefer (minimized?) versions BSD utilities. In Android 6 source code:

-   `/system/bin/sh` which is the shell. `sh -v` says it is `mksh` <https://launchpad.net/mksh>, BSD.
-   `grep` is from BSD `system/core/toolbox/upstream-netbsd/usr.bin/grep`
    - `dd` too: `system/core/toolbox/upstream-netbsd/bin/dd/dd.c`
-   <https://en.wikipedia.org/wiki/Toybox> under `external/toybox/toys/posix` provides most small utilities. It is a BSD `busybox`.

So much for the GPL, Google is just like Apple and will gladly fork BSD stuff when the money shows.
