package com.cirosantilli.android_cheat.textviewnewline;

import android.app.Activity;
import android.os.Bundle;
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
        setContentView(tv);
    }
}
