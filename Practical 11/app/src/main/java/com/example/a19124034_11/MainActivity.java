package com.example.a19124034_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView connection, connectionType;
    private Button checkConnection, checkConnectionType;
    private ConnectivityManager cm;
    private NetworkInfo nInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connection = findViewById(R.id.connected);
        connectionType = findViewById(R.id.connectionType);
        checkConnection = findViewById(R.id.connectionToNetwork);
        checkConnectionType = findViewById(R.id.checkConnectionType);

        // Hide the ui elements and show them when connected
        checkConnectionType.setVisibility(View.GONE);
        connectionType.setVisibility(View.GONE);

        Log.e("################", "here");
        checkConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("################", "here12333");
                cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
                String res = connected ? "Connected" : "Not Connected ~~";
                connection.setText(res);

                if(connected) {
                    checkConnectionType.setVisibility(View.VISIBLE);
                    connectionType.setVisibility(View.VISIBLE);
                }
                else{
                    checkConnectionType.setVisibility(View.GONE);
                    connectionType.setVisibility(View.GONE);
                }
            }
        });

        checkConnectionType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isWifi = nInfo.getType() == ConnectivityManager.TYPE_WIFI;
                String res = isWifi ? "Using Wifi" : "Using Mobile Data";

                connectionType.setText(res);
            }
        });
    }
}