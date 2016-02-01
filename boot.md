# Boot

Most devices have the bootloader unlocked.

## Unlocking the bootloader

**WILL WIPE YOUR LOCAL PHONE DATA!** <http://android.stackexchange.com/questions/33691/why-does-unlocking-the-bootloader-wipe-phone>

### SONY Xperia Z3 D6643

Sony requires unlocking on the website, but allows it for many phones: <http://developer.sonymobile.com/unlockbootloader/unlock-yourboot-loader/>x

It voids warranty.

It doesn't have to be at the exact same time: if you hold up and insert, it works.

TODO what is the name of this blue light mode? I think it is fastboot mode?

First enter fastboot mode.

Then run:

    sudo "$(which fastboot)" devices
    # Replace with your unlock code from the website.
    sudo "$(which fastboot)" -i 0x0fce oem unlock 0x0000000000000000

Now you can remove the cable, and hold at the same time:

- power
- volume up
- volume down

buttons. And it will enter the boot screen.

## fastboot mode

Name of an SDK CLI tool and a boot mode.

<http://www.androidcentral.com/android-z-what-fastboot>

TODO: what is this mode?

### SONY Xperia Z3 D6643

Insert computer power USB with sound up button clicked. The status LED turns blue instead of the regular red (charging) / green (charged), and the screen is blank.

## recovery mode

TODO adb reboot recovery does not work.

### SONY Xperia Z3 D6643

TODO how to enter it?

Official video does not work: <https://www.youtube.com/watch?v=TFjvirit24I>

Unofficial: <https://www.youtube.com/watch?v=I_E9WmBXdV0> Power + Up + Down, then release only Up and press when logo appears.
