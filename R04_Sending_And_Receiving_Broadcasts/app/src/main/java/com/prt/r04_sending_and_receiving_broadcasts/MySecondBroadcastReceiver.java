package com.prt.r04_sending_and_receiving_broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Pikalova Lena on 2/26/2017.
 */

public class MySecondBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,
                "Received broadcast in MySecondReceiver (registering receiver in the manifest file); " +
                " value received: " + intent.getStringExtra("key"),
                Toast.LENGTH_SHORT).show();
    }
}
