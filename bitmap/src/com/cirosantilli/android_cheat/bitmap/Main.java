package com.cirosantilli.android_cheat.bitmap;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int width = 400;
        final int height = 300;
        final int max = 255;
        final Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                bitmap.setPixel(x, y, Color.argb(
                            max,
                            (int)(max*x/((float)width)),
                            (int)(max*y/((float)height)),
                            (int)(max*x*y/((float)width*height))));
            }
        }
        final ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);
        setContentView(imageView);
    }
}
