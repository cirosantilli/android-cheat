package com.cirosantilli.android_cheat.handler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int i = 0;
        final TextView textView = new TextView(this);
        textView.setText(String.format("%d", i));
        setContentView(textView);
        final Handler handler = new Handler();
        class MyRunnable implements Runnable {
            private Handler handler;
            private int i;
            private TextView textView;
            public MyRunnable(Handler handler, int i, TextView textView) {
                this.handler = handler;
                this.i = i;
                this.textView = textView;
            }
            @Override
            public void run() {
                this.handler.postDelayed(this, 500);
                this.i++;
                this.textView.setText(String.format("%d", i));
            }
        }
        handler.post(new MyRunnable(handler, i, textView));
    }
}
