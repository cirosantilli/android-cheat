package com.cirosantilli.android_cheat.server_socket;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;


public class Main extends Activity {
    static final int port = 12345;
    static final String TAG = "AndroidCheatServerSocket";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText(String.format("Server listening on port %d\nDevice IP is one of:\n%s", Main.port, getIps()));
        setContentView(tv);
        Log.d(Main.TAG, "onCreate");
        // We need a `Service` or other background method or else:
        // http://stackoverflow.com/questions/6343166/android-os-networkonmainthreadexception
        Main.this.startService(new Intent(Main.this, MyService.class));
    }

    private static String getIps() {
        StringBuilder sb = new StringBuilder();
        try {
            Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
            while (en.hasMoreElements()) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                    sb.append(enumIpAddr.nextElement().toString() + "\n");
                }
            }
        } catch (SocketException e) {
            Log.d(Main.TAG, e.toString());
        }
        return sb.toString();
    }

    public static class MyService extends IntentService {
        public MyService() {
            super("MyService");
        }
        @Override
        protected void onHandleIntent(Intent intent) {
            Log.d(Main.TAG, "onHandleIntent");
            ServerSocket listener = null;
            try {
                listener = new ServerSocket(Main.port);
                Log.d(Main.TAG, String.format("listening on port = %d", Main.port));
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
