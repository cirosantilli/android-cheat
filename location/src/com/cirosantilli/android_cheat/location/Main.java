package com.cirosantilli.android_cheat.location;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.common.ConnectionResult;

public class Main extends Activity
        implements ConnectionCallbacks, OnConnectionFailedListener {
    private GoogleApiClient mGoogleApiClient = null;
    private Location mLastLocation;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
        }
        mTextView = new TextView(this);
        setContentView(mTextView);
    }
    @Override
    protected void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }
    @Override
    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }
    @Override
    public void onConnected(Bundle connectionHint) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            mTextView.setText(String.valueOf(mLastLocation.getLatitude()) + " " + String.valueOf(mLastLocation.getLongitude()));
        }
    }
    @Override
    public void onConnectionFailed (ConnectionResult result) {
        mTextView.setText("connection failed");
    }
    @Override
    public void onConnectionSuspended(int cause) {
        mTextView.setText("connection suspended");
    }
}
