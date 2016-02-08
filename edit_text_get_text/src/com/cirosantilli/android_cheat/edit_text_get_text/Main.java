package com.cirosantilli.android_cheat.edit_text_get_text;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final EditText editText = new EditText(this);
        editText.setText("initial value");

        final Button button = new Button(this);
        button.setText("click me");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        editText.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        final LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(button);
        linearLayout.addView(editText);
        this.setContentView(linearLayout);
    }
}
