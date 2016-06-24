package com.cirosantilli.android_cheat.ndk_asm;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(jniMethod());
        setContentView(tv);
    }
    public native String jniMethod();
    static {
        System.loadLibrary("main");
    }
}
