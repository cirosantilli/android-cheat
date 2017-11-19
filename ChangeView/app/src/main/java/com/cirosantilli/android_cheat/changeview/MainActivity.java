package com.cirosantilli.android_cheat.changeview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
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
                MainActivity.this.i++;
                final Button button = new Button(MainActivity.this);
                button.setText("click me " + MainActivity.this.i);
                button.setOnClickListener(this);
                MainActivity.this.setContentView(button);
            }
        });
        this.setContentView(button);
    }
}
