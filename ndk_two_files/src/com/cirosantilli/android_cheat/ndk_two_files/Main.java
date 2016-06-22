package com.cirosantilli.android_cheat.ndk_two_files;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(Integer.toString(jniMethod()));
        setContentView(tv);
    }
    public native int jniMethod();
    static {
        System.loadLibrary("main");
    }
}
