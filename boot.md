# Boot

Most devices have the bootloader unlocked.

## Unlocking the bootloader

**WILL WIPE YOUR LOCAL PHONE DATA!** <http://android.stackexchange.com/questions/33691/why-does-unlocking-the-bootloader-wipe-phone>

## Sony

Sony requires unlocking, but allows it for many phones: <http://developer.sonymobile.com/unlockbootloader/unlock-yourboot-loader/> It voids warranty.

When the guide says: insert USB with sound up button clicked, it is not joking: that does put the device on a special mode. This can be seen as the status LED turns blue instead of the regular red (charging) / green (charged). It doesn't have to be at the exact same time: if you hold up and insert, it works.

TODO what is the name of this blue light mode? Is that fastboot?

Then run:

    sudo "$(which fastboot)" devices
    # Replace with your unlock code from the website.
    sudo "$(which fastboot)" -i 0x0fce oem unlock 0x0000000000000000

Now you can remove the cable, and hold at the same time:

- power
- volume up
- volume down

buttons. And it will enter the boot screen.

## fastboot

Name of an SDK CLI tool.

<http://www.androidcentral.com/android-z-what-fastboot>
