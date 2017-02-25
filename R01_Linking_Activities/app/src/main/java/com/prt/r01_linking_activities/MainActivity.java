package com.prt.r01_linking_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // for calling an activity that is within the same application,
        // as well as for other applications to call your activity

        // Link to Activity2 (1)
        Intent intent = new Intent("com.prt.r01_linking_activities.Activity2");
        startActivity(intent);

        // Link to Activity2 (2)
//        Intent intent = new Intent();
//        // method to set the name of the target activity
//        intent.setAction("com.prt.r01_linking_activities.Activity2");
//        startActivity(intent);


    // for calling an activity that is internal to that application

        // Link to Activity2 (3)
//        Intent intent = new Intent(this, Activity2.class);
//        startActivity(intent);


    // if an 'action' in manifest file doesn't exist

        // Link to Activity2 (4)
        // if an 'action' in manifest file doesn't exist
//        Intent intent = new Intent("com.prt.r01_linking_activities.Activity2");
//        // the message is displayed if an activity cannot by found
//        startActivity(Intent.createChooser(intent, "Choose an application"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
