package com.cirosantilli.android_cheat.alert_dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView textView = new TextView(this);
        textView.setText("before");
        this.setContentView(textView);
        new AlertDialog.Builder(this)
            .setTitle("Title of alert")
            .setMessage("Message of the alert. Yes or no?")
            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    textView.setText("yes");
                }
            })
            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    textView.setText("no");
                }
            })
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show();
    }
}
