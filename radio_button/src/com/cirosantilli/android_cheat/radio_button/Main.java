package com.cirosantilli.android_cheat.radio_button;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends Activity {
    private static final String TAG = "com.cirosantilli";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView textView = new TextView(this);
        final RadioButton radioButton0 = new RadioButton(this);
        radioButton0.setText("0");
        final RadioButton radioButton1 = new RadioButton(this);
        radioButton1.setText("1");
        final RadioButton radioButton2 = new RadioButton(this);
        radioButton2.setText("2");

        final RadioGroup radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(RadioGroup.VERTICAL);
        radioGroup.addView(radioButton0);
        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);
        radioGroup.addView(textView);
        radioGroup.check(radioButton1.getId());
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                setText(textView, checkedId);
            }
        });
        Log.d(Main.TAG, Integer.toString(radioGroup.getCheckedRadioButtonId()));
        Log.d(Main.TAG, Integer.toString(radioButton1.getId()));
        setContentView(radioGroup);
        /* Must come after setContentView or else findviewById gives null. */
        this.setText(textView, radioGroup.getCheckedRadioButtonId());
    }
    private void setText(TextView textView, int checkedId) {
        Log.d(Main.TAG, Integer.toString(checkedId));
        Log.d(Main.TAG, Boolean.toString(this.findViewById(checkedId) == null));
        textView.setText("checked = " + ((RadioButton)this.findViewById(checkedId)).getText());
    }
}
