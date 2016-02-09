package com.cirosantilli.android_cheat.two_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button button = new Button(this);
        button.setText("click me to go to activity 2");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main.this.startActivity(new Intent(Main.this, Main.Activity2.class));
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
                    Main.Activity2.this.startActivity(new Intent(Main.Activity2.this, Main.class));
                }
            });
            this.setContentView(button);
        }
    }
}
