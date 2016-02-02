package com.cirosantilli.android_cheat.linear_layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final LinearLayout linearLayout = new LinearLayout(this);

        final TextView tv1;
        tv1 = new TextView(this);
        tv1.setText("tv1");
        linearLayout.addView(tv1);

        final TextView tv2;
        tv2 = new TextView(this);
        tv2.setText("tv2");
        linearLayout.addView(tv2);

        this.setContentView(linearLayout);
    }

}
