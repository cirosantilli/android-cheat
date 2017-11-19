package com.cirosantilli.android_cheat.asynctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText("before");
        setContentView(tv);
        new MyAsyncTask(tv).execute(1);
    }

    private class MyAsyncTask extends AsyncTask<Integer, Void, String> {
        TextView tv;
        MyAsyncTask(TextView tv) {
            super();
            this.tv = tv;
        }
        @Override
        protected String doInBackground(Integer... params) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            return params[0].toString();
        }
        @Override
        protected void onPostExecute(String result) {
            this.tv.setText(result);
        }
    }
}
