package com.cirosantilli.android_cheat.socket;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.IntentService;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main extends Activity {
    final static String TAG = "AndroidCheatSocket";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView;

        final String defaultHostname = "192.168.0.";
        textView = new TextView(this);
        textView.setText("hostname / IP:");
        linearLayout.addView(textView);
        final EditText hostnameEditText = new EditText(this);
        hostnameEditText.setText(defaultHostname);
        hostnameEditText.setSingleLine(true);
        linearLayout.addView(hostnameEditText);

        textView = new TextView(this);
        textView.setText("port:");
        linearLayout.addView(textView);
        final EditText portEditText = new EditText(this);
        portEditText.setText("12345");
        portEditText.setSingleLine(true);
        linearLayout.addView(portEditText);

        textView = new TextView(this);
        textView.setText("data to send:");
        linearLayout.addView(textView);
        final EditText dataEditText = new EditText(this);
        dataEditText.setText(String.format("GET / HTTP/1.1\r\nHost: %s\r\n\r\n", defaultHostname));
        linearLayout.addView(dataEditText);

        final TextView replyTextView = new TextView(this);
        final ScrollView replyTextScrollView = new ScrollView(this);
        replyTextScrollView.addView(replyTextView);

        final Button button = new Button(this);
        button.setText("contact server");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setEnabled(false);
                new MyAsyncTask(Main.this, replyTextView, button).execute(
                        hostnameEditText.getText().toString(),
                        portEditText.getText().toString(),
                        dataEditText.getText().toString());

            }
        });
        linearLayout.addView(button);

        textView = new TextView(this);
        textView.setText("output:");
        linearLayout.addView(textView);
        linearLayout.addView(replyTextScrollView);

        this.setContentView(linearLayout);
    }

    private class MyAsyncTask extends AsyncTask<String, Void, String> {
        Activity activity;
        Button button;
        TextView textView;
        IOException ioException;
        MyAsyncTask(Activity activity, TextView textView, Button button) {
            super();
            this.activity = activity;
            this.textView = textView;
            this.button = button;
            this.ioException = null;
        }
        @Override
        protected String doInBackground(String... params) {
            StringBuilder sb = new StringBuilder();
            try {
                Socket socket = new Socket(
                        params[0],
                        Integer.parseInt(params[1]));
                OutputStream out = socket.getOutputStream();
                out.write(params[2].getBytes());
                InputStream in = socket.getInputStream();
                byte buf[] = new byte[1024];
                int nbytes;
                while ((nbytes = in.read(buf)) != -1) {
                    sb.append(new String(buf, 0, nbytes));
                }
                socket.close();
            } catch(IOException e) {
                this.ioException = e;
                return "error";
            }
            return sb.toString();
        }
        @Override
        protected void onPostExecute(String result) {
            if (this.ioException != null) {
                new AlertDialog.Builder(this.activity)
                    .setTitle("An error occurrsed")
                    .setMessage(this.ioException.toString())
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
            } else {
                this.textView.setText(result);
            }
            this.button.setEnabled(true);
        }
    }
}
