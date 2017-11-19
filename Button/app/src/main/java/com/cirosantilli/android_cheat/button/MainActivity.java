package com.cirosantilli.android_cheat.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.i = 0;

        final TextView tv = new TextView(this);
        tv.setText(String.format("%d", this.i));

        final Button button = new Button(this);
        button.setText("click me");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.i++;
                tv.setText(String.format("%d", MainActivity.this.i));
            }
        });

        final LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(button);
        linearLayout.addView(tv);
        this.setContentView(linearLayout);
    }
}
