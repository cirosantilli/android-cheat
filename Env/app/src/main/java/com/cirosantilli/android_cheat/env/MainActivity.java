package com.cirosantilli.android_cheat.env;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        StringBuilder sb = new StringBuilder();
        sb.append("user.dir = " + System.getProperty("user.dir") + "\n");
        sb.append("user.name = " + System.getProperty("user.name") + "\n");
        tv.setText(sb.toString());
        setContentView(tv);
    }
}
