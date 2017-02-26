package com.prt.r04_sending_and_receiving_broadcasts;

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
    public void onResume() {
        super.onResume();
        // register the receiver
        registerReceiver(myReceiver, intentFilter);
    }

    @Override
    public void onPause() {
        super.onPause();
        // unregister the receiver
        unregisterReceiver(myReceiver);
    }

    public void onClick(View view) {
        Intent intent = new Intent("MY_SPECIFIC_ACTION");
        intent.putExtra("key", "some value from intent");
        sendBroadcast(intent);
    }

    public class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,
                        "Received broadcast in MyBroadcastReceiver, " +
                        " value received: " + intent.getStringExtra("key"),
                        Toast.LENGTH_SHORT).show();
        }
    }
}
