package com.cirosantilli.android_cheat.relative_layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final RelativeLayout relativeLayout = new RelativeLayout(this);

        final TextView tv1;
        tv1 = new TextView(this);
        tv1.setText("tv1");
        // Setting an ID is mandatory.
        tv1.setId(View.generateViewId());
        relativeLayout.addView(tv1);

        final TextView tv2;
        tv2 = new TextView(this);
        tv2.setText("tv2");
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.FILL_PARENT);
        lp.addRule(RelativeLayout.BELOW, tv1.getId());
        relativeLayout.addView(tv2, lp);

        this.setContentView(relativeLayout);
    }
}
