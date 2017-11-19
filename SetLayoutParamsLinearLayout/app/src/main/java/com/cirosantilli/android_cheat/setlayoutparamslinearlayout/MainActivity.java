package com.cirosantilli.android_cheat.setlayoutparamslinearlayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final LinearLayout linearLayout = new LinearLayout(this);
        TextView tv;

        tv = new TextView(this);
        tv.setText("wrap wrap");
        tv.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        tv.setBackgroundColor(Color.RED);
        linearLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("wrap match");
        tv.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        tv.setBackgroundColor(Color.GREEN);
        linearLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("match match");
        tv.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        tv.setBackgroundColor(Color.RED);
        linearLayout.addView(tv);

        setContentView(linearLayout);
    }
}
