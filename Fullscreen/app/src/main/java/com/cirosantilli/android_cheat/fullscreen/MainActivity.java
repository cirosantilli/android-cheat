package com.cirosantilli.android_cheat.fullscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText("hello world");
        setContentView(tv);
        this.getWindow().getDecorView().setSystemUiVisibility(
                /* The bottom bar, with 3 buttons. */
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                /* Only show status and navigation for a few seconds, and then auto-hide. */
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                /* Hide the top bar, called "status bar".*/
                View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
