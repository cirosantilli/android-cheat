package com.cirosantilli.android_cheat.camera_one_shot;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceView;
import android.util.Log;
import android.widget.ImageView;
import java.io.IOException;

public class Main extends Activity {
    public static final String TAG = "com.cirosantilli";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView imageView = new ImageView(this);
        this.setContentView(imageView);
        final SurfaceView surface = new SurfaceView(this);
        Camera camera = Camera.open();
        try {
            camera.setPreviewDisplay(surface.getHolder());
        } catch (IOException e) {
            Log.e(Main.TAG, e.toString());
        }
        camera.startPreview();
        camera.takePicture(null, null, new Camera.PictureCallback(){
            @Override
            public void onPictureTaken(byte[] data, Camera camera) {
                imageView.setImageBitmap(BitmapFactory.decodeByteArray(data, 0, data.length));
            }
        });
    }
}
