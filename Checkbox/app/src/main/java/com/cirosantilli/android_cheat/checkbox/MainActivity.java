package com.cirosantilli.android_cheat.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView textView = new TextView(this);
        final CheckBox checkBox0 = new CheckBox(this);
        final CheckBox checkBox1 = new CheckBox(this);

        textView.setText(this.getText(checkBox0, checkBox1));

        class OnClickListener implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                textView.setText(MainActivity.this.getText(checkBox0, checkBox1));
            }
        }
        checkBox0.setOnClickListener(new OnClickListener());
        checkBox0.setText("0");
        checkBox1.setOnClickListener(new OnClickListener());
        checkBox1.setText("1");

        final LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.addView(checkBox0);
        linearLayout.addView(checkBox1);
        linearLayout.addView(textView);
        setContentView(linearLayout);
    }

    private String getText(CheckBox checkBox0, CheckBox checkBox1) {
        StringBuilder sb = new StringBuilder("checked: ");
        if (checkBox0.isChecked())
            sb.append("0 ");
        if (checkBox1.isChecked())
            sb.append("1 ");
        return sb.toString();
    }
}
