package com.cirosantilli.android_cheat.log;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyTag", "MyMsg");
        Log.e("MyTag", "MyMsg");
        Log.i("MyTag", "MyMsg");
        Log.v("MyTag", "MyMsg");
        Log.w("MyTag", "MyMsg");
        Log.wtf("MyTag", "MyMsg");
    }

}
