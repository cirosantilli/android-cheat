package com.cirosantilli.android_cheat.socket;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main extends Activity {
    static final String TAG = "AndroidCheatSocket";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Main.TAG, "onCreate");
        // We need a `Service` or other background method or else:
        // http://stackoverflow.com/questions/6343166/android-os-networkonmainthreadexception
        Main.this.startService(new Intent(Main.this, MyService.class));
    }

    public static class MyService extends IntentService {
        public MyService() {
            super("MyService");
        }
        @Override
        protected void onHandleIntent(Intent intent) {
            Log.d(Main.TAG, "onHandleIntent");
            final int port = 12345;
            ServerSocket listener = null;
            try {
                listener = new ServerSocket(port);
                Log.d(Main.TAG, String.format("listening on port = %d", port));
                while (true) {
                    Log.d(Main.TAG, "waiting for client");
                    Socket socket = listener.accept();
                    Log.d(Main.TAG, String.format("client connected from: %s", socket.getRemoteSocketAddress().toString()));
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintStream out = new PrintStream(socket.getOutputStream());
                    for (String inputLine; (inputLine = in.readLine()) != null;) {
                        Log.d(Main.TAG, "received");
                        Log.d(Main.TAG, inputLine);
                        StringBuilder outputStringBuilder = new StringBuilder("");
                        char inputLineChars[] = inputLine.toCharArray();
                        for (char c : inputLineChars)
                            outputStringBuilder.append(Character.toChars(c + 1));
                        out.println(outputStringBuilder);
                    }
                }
            } catch(IOException e) {
                Log.d(Main.TAG, e.toString());
            }
        }
    }
}
