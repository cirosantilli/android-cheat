package com.cirosantilli.android_cheat.min;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText("hello world");
        setContentView(tv);
    }

}
