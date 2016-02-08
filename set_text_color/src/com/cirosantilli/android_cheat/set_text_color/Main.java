package com.cirosantilli.android_cheat.set_text_color;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText("hello world");
        tv.setTextColor(Color.RED);

        final LinearLayout linearLayout = new LinearLayout(this);

        setContentView(tv);
    }
}
