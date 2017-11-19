package com.cirosantilli.android_cheat.scrollingmovementmethod;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
        tv.setMovementMethod(new ScrollingMovementMethod());
        setContentView(tv);
    }
}
