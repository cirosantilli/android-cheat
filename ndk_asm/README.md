# NDK asm

<http://stackoverflow.com/questions/6506781/arm-assembly-code-in-an-android-project>

Run some raw ARM assembly, both from separate file, and inline.

Expected outcome:

    arm 0

`jni/Application.mk` variable `APP_ABI` controls what archs to build for.

Ideally we leave it at `all` for greater portability.

In that case, we need to avoid compiling under the wrong arch, we need:

- `#ifdef`s on C files
- `ifeq`s on `Android.mk`
