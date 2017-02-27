package com.prt.r05_assigning_priorities_to_broadcast_receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyBroadcastReceiver myReceiver;
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myReceiver = new MyBroadcastReceiver();
        intentFilter = new IntentFilter("MY_SPECIFIC_ACTION");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // assigning a priority to a broadcast receiver
        intentFilter.setPriority(10);
        registerReceiver(myReceiver, intentFilter);
    }

    @Override
    public void onPause() {
        super.onPause();
        unregisterReceiver(myReceiver);
    }

    public void onClick(View view) {
        Intent intent = new Intent("MY_SPECIFIC_ACTION");
        intent.putExtra("key", "some value from intent");

        // allows broadcast to be aborted
        // allows broadcast receiver to set priority
        sendOrderedBroadcast(intent, null);

        // or to send broadcast receiver with the permission to access the Internet
        sendOrderedBroadcast(intent, "android.permission.INTERNET");
    }

    public class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,
                    "Received broadcast in MyBroadcastReceiver (registering receiver in the method), " +
                            " value received: " + intent.getStringExtra("key"),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
