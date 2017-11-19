package com.cirosantilli.android_cheat.twoactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button button = new Button(this);
        button.setText("click me to go to activity 2");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, MainActivity.Activity2.class));
            }
        });
        this.setContentView(button);
    }

    public static class Activity2 extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            final Button button = new Button(this);
            button.setText("click me to go to activity 1");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity.Activity2.this.startActivity(new Intent(MainActivity.Activity2.this, MainActivity.class));
                }
            });
            this.setContentView(button);
        }
    }
}
