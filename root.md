# Root

# sudo

The process of getting Linux kernel super user privileges, which are not enabled by default!

TODO what does it do exactly?

- <http://gizmodo.com/5982287/reasons-to-root-your-android-device>
- <http://www.androidcentral.com/root>
- <http://www.digitaltrends.com/mobile/how-to-root-android/>
- <http://stackoverflow.com/questions/1043322/why-do-i-get-access-denied-to-data-folder-when-using-adb>

Many rooted apps are available on the Play store itself. Google is much less restrictive than Apple is about jailbreaking.

You need to backup your ROM and replace it with a new one.

## run-as

Run as the user of a given package of an `app` (the package is an unique app ID, each app has one Linux user):

    run-as com.cirosantilli.mypackage

TODO: permission denied. Requires sudo?

## How it works

There are two methods: <https://www.kingoapp.com/faq.htm>

- Finding firmware exploits and using them: <https://www.quora.com/What-does-root-access-mean-on-an-Android-phone-What-can-be-done-after-rooting-a-phone>. Used by Kingo.
- Flashing a new rooted disk.

## Kingo

Kingo Root method: <https://www.youtube.com/watch?v=AWNykj-lb-I>

Works via exploits.

Once you have it, just type `su` on the SSH session or terminal emulator and go.

## Sony Xperia Z3 D6643

<http://forum.xda-developers.com/z3/help/how-to-proceed-d6643-model-t2960099>
