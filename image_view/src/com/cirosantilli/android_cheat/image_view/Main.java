package com.cirosantilli.android_cheat.image_view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView imageView = new ImageView(this);
        /* Just put the name of the file here. */
        imageView.setImageResource(R.drawable.flower);
        setContentView(imageView);
    }

}
