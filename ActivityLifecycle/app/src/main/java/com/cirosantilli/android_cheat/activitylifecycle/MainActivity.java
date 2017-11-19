package com.cirosantilli.android_cheat.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private void toastLog(String s) {
        Toast.makeText(this.getApplicationContext(),
                s, Toast.LENGTH_SHORT).show();
        Log.d("ActivityLifecycle", s);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toastLog("onCreate");
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

    protected void onStart() {
        super.onStart();
        toastLog("onStart");
    }

    protected void onRestart() {
        super.onRestart();
        toastLog("onRestart");
    }

    protected void onResume() {
        super.onResume();
        toastLog("onResume");
    }

    protected void onPause() {
        super.onPause();
        toastLog("onPause");
    }

    protected void onStop() {
        super.onStop();
        toastLog("onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        toastLog("onDestroy");
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
