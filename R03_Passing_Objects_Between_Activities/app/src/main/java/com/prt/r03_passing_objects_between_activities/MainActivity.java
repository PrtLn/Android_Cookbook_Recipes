package com.prt.r03_passing_objects_between_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new
                Intent("com.prt.r03_passing_objects_between_activities.SecondActivity");

        // create my own custom object
        MyCustomClass myObject = new MyCustomClass();
        myObject.setName("Lena Pikalova");
        myObject.setEmail("pirit.lena@gmail.com");
        intent.putExtra("MyObject", myObject);

        startActivityForResult(intent, 1);
    }

    public void onActivityResult(int requestCode,
                                 int resultCode,
                                 Intent back) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, back.getStringExtra("str"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
