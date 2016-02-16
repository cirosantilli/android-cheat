package com.cirosantilli.android_cheat.ndk_log;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jniMethod();
    }
    public native void jniMethod();
    static {
        System.loadLibrary("main");
    }
}
