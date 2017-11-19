package com.cirosantilli.android_cheat.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button button = new Button(this);
        button.setText("click me");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Notification notification = new Notification.Builder(MainActivity.this)
                        /* Make app open when you click on the notification. */
                        .setContentIntent(PendingIntent.getActivity(
                                MainActivity.this,
                                MainActivity.this.i,
                                new Intent(MainActivity.this, MainActivity.class),
                                PendingIntent.FLAG_CANCEL_CURRENT))
                        .setContentTitle("title")
                        .setAutoCancel(true)
                        .setContentText(String.format("id = %d", MainActivity.this.i))
                        // Starting on Android 5, only the alpha channel of the image matters.
                        // http://stackoverflow.com/a/35278871/895245
                        // `android.R.drawable` resources all seem suitable.
                        .setSmallIcon(android.R.drawable.star_on)
                        // Color of the background on which the alpha image wil drawn white.
                        .setColor(Color.RED)
                        .setLights(Color.MAGENTA, 500, 2000)
                        .build();
                // Flags can be set like this.
                //notification.flags |= Notification.FLAG_ONGOING_EVENT;
                ((NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE))
                        .notify(MainActivity.this.i, notification);
                // If the same ID were used twice, the second notification would replace the first one. 
                //notificationManager.notify(0, notification);
                MainActivity.this.i++;
            }
        });
        this.setContentView(button);
    }
}
