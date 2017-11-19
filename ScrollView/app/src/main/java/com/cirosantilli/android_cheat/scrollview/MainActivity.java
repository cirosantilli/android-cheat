package com.cirosantilli.android_cheat.scrollview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++)
            sb.append(Integer.toString(i) + "\n");
        tv.setText(sb.toString());
        ScrollView sv = new ScrollView(this);
        sv.addView(tv);
        setContentView(sv);
    }
}
