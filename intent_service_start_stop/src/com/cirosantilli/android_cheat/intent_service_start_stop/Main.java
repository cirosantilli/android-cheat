package com.cirosantilli.android_cheat.intent_service_start_stop;

import android.app.Activity;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main extends Activity {
    static final String BROADCAST_ACTION = "com.cirosantilli.android_cheat.intent_service_text_view.BROADCAST";
    static final String EXTENDED_DATA_STATUS = "com.cirosantilli.android_cheat.intent_service_text_view.BROADCAST";
    static final String TAG = "com.cirosantilli";

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        final LinearLayout linearLayout = new LinearLayout(this);
        Button button;
        final Intent intent = new Intent(Main.this, MyService.class);

        button = new Button(this);
        button.setText("start service");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "start button");
                /*
                This may get called multiple times, but it does not matter:
                http://stackoverflow.com/questions/8019899/starting-a-service-multiple-timese

                TODO closing the app the app stops the service (see log). Why?
                Shouldn't startService outlive the app, and bind die with it?
                - http://stackoverflow.com/questions/29521437/android-keep-service-running-even-when-app-is-closedc
                - http://stackoverflow.com/questions/16651009/android-service-stops-when-app-is-closed
                */
                Main.this.startService(intent.putExtra(Main.EXTENDED_DATA_STATUS, Main.this.i));
            }
        });
        linearLayout.addView(button);

        button = new Button(this);
        button.setText("stop service");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "stop button");
                Main.this.stopService(intent);
            }
        });
        linearLayout.addView(button);

        final TextView textView = new TextView(this);
        textView.setText(Integer.toString(i));
        linearLayout.addView(textView);
        this.setContentView(linearLayout);

        LocalBroadcastManager.getInstance(this).registerReceiver(
                new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        Main.this.i = intent.getIntExtra(Main.EXTENDED_DATA_STATUS, 0);
                        textView.setText(Integer.toString(Main.this.i));
                    }
                }, new IntentFilter(Main.BROADCAST_ACTION)
        );
    }

    public static class MyService extends IntentService {
        private int i = 1;
        private boolean done;
        public MyService() {
            super("MyService");
        }
        @Override
        protected void onHandleIntent(Intent intent) {
            Log.d(TAG, "onHandleIntent");
            this.i = intent.getIntExtra(Main.EXTENDED_DATA_STATUS, 0);
            this.done = false;
            while(!done) {
                Log.d(TAG, "while true");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                LocalBroadcastManager.getInstance(this).sendBroadcast(
                        new Intent(Main.BROADCAST_ACTION)
                        .putExtra(Main.EXTENDED_DATA_STATUS, MyService.this.i));
                this.i++;
            }
        }
        @Override
        public void onDestroy() {
            Log.d(TAG, "onDestroy");
            // TODO: is this the proper way?
            // http://stackoverflow.com/questions/11258083/forcing-an-intentservice-to-stop-immediately
            this.done = true;
            super.onDestroy();
        }
    }
}
