package com.prt.r02_passingdata_between_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new
                Intent("com.prt.r02_passingdata_between_activities.SecondActivity");

        // using the putExtra() method to add new key/value pairs
        intent.putExtra("str1", "This is a string");
        intent.putExtra("age1", 25);

        // using a Bundle object to add new key/values pairs
        Bundle extras = new Bundle();
        extras.putString("str2", "This is another string");
        extras.putInt("age2", 35);

        // attach the Bundle object to the Intent object
        intent.putExtras(extras);

        // start the activity to get a result back
        startActivityForResult(intent, 1);
    }

}
