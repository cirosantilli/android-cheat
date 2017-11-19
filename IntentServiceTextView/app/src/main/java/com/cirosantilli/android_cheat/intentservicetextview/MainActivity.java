package com.cirosantilli.android_cheat.intentservicetextview;

import android.app.Activity;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    static final String BROADCAST_ACTION = "com.cirosantilli.android_cheat.intentservicetextview.BROADCAST";
    static final String EXTENDED_DATA_STATUS = "com.cirosantilli.android_cheat.intentservicetextview.BROADCAST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView textView = new TextView(this);
        textView.setText("before");
        setContentView(textView);
        this.startService(new Intent(this, MyService.class));
        LocalBroadcastManager.getInstance(this).registerReceiver(
                new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        textView.setText(intent.getStringExtra(MainActivity.EXTENDED_DATA_STATUS));
                    }
                }, new IntentFilter(MainActivity.BROADCAST_ACTION)
        );
    }
    public static class MyService extends IntentService {
        public MyService() {
            super("MyService");
        }
        @Override
        protected void onHandleIntent(Intent intent) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            LocalBroadcastManager.getInstance(this).sendBroadcast(
                    new Intent(MainActivity.BROADCAST_ACTION)
                    .putExtra(MainActivity.EXTENDED_DATA_STATUS, "after"));
        }
    }
}
