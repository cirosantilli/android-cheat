/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cirosantilli.android_cheat.nativecodecminimized;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    static final String TAG = "NativeCodecMinimized";
    static final String mVideoPath = "/sdcard/testfile.mp4";
    SurfaceView mSurfaceView;
    SurfaceHolder mSurfaceHolder;
    boolean mCreated = false;
    boolean mIsPlaying = false;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        Button button;

        button = new Button(this);
        button.setText("play/pause");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mCreated) {
                    mCreated = createStreamingMediaPlayer(mVideoPath);
                }
                if (mCreated) {
                    mIsPlaying = !mIsPlaying;
                    setPlayingStreamingMediaPlayer(mIsPlaying);
                }
            }
        });
        linearLayout.addView(button);

        button = new Button(this);
        button.setText("rewind");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rewindStreamingMediaPlayer();
            }
        });
        linearLayout.addView(button);

        mSurfaceView = new SurfaceView(this);
        mSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(640, 480));
        mSurfaceHolder = mSurfaceView.getHolder();
        mSurfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                Log.v(TAG, "surfaceChanged format=" + format + ", width=" + width + ", height="
                        + height);
            }
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Log.v(TAG, "surfaceCreated");
                setSurface(holder.getSurface());
            }
            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                Log.v(TAG, "surfaceDestroyed");
            }
        });
        linearLayout.addView(mSurfaceView);

        setContentView(linearLayout);
    }

    @Override
    protected void onPause() {
        mIsPlaying = false;
        setPlayingStreamingMediaPlayer(false);
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        shutdown();
        mCreated = false;
        super.onDestroy();
    }

    public static native boolean createStreamingMediaPlayer(String filename);
    public static native void setPlayingStreamingMediaPlayer(boolean isPlaying);
    public static native void shutdown();
    public static native void setSurface(Surface surface);
    public static native void rewindStreamingMediaPlayer();

    static {
         System.loadLibrary("main");
    }
}
