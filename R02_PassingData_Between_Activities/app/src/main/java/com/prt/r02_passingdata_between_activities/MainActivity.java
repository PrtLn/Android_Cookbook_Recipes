package com.prt.r02_passingdata_between_activities;

import android.content.Intent;
import android.net.Uri;
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

    // Passing the data to SecondActivity
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

    // Getting back the data from SecondActivity
    public void onActivityResult(int requestCode,
                                 int resultCode,
                                 Intent data) {
        // check if the request code is 1
        if (requestCode == 1) {
            // if the result is OK
            if (resultCode == RESULT_OK) {
                // get the result using getIntExtra()
                Toast.makeText(this, Integer.toString(
                        data.getIntExtra("age3", 0)),
                        Toast.LENGTH_SHORT).show();

                // get the result using getData()
                Uri url = data.getData();
                Toast.makeText(this, url.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
