package com.prt.r05_assigning_priorities_to_broadcast_receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Pikalova Lena on 2/27/2017.
 */

public class MySecondBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,
                "Received broadcast in MySecondBroadcastReceiver; value received: " +
                intent.getStringExtra("key"),
                Toast.LENGTH_SHORT).show();

        // abort the broadcast
        abortBroadcast();

    }
}
