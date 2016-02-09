package com.cirosantilli.android_cheat.change_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.i = 0;
        final Button button = new Button(this);
        button.setText("click me " + this.i);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main.this.i++;
                final Button button = new Button(Main.this);
                button.setText("click me " + Main.this.i);
                button.setOnClickListener(this);
                Main.this.setContentView(button);
            }
        });
        this.setContentView(button);
    }
}
