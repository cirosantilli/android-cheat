package com.cirosantilli.androidcheat.ndk;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView  tv = new TextView(this);
        tv.setText( stringFromJNI() );
        setContentView(tv);
    }
    public native String  stringFromJNI();
    public native String  unimplementedStringFromJNI();
    static {
        System.loadLibrary("main");
    }
}
