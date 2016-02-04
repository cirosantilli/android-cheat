package com.cirosantilli.android_cheat.video_view;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final VideoView videoView = new VideoView(this);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lego));
        setContentView(videoView);
        videoView.start();
    }

}
