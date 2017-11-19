package com.cirosantilli.android_cheat.setbackgroundcolor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText("hello world");
        tv.setBackgroundColor(Color.RED);
        this.setContentView(tv);
    }
}
