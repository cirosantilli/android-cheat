package com.cirosantilli.android_cheat.log;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyTag", "MyMsg");
        Log.e("MyTag", "MyMsg");
        Log.i("MyTag", "MyMsg");
        Log.v("MyTag", "MyMsg");
        Log.w("MyTag", "MyMsg");
        Log.wtf("MyTag", "MyMsg");
        /* No printf: http://stackoverflow.com/questions/4491370/how-to-log-an-int-on-android */
    }

}
