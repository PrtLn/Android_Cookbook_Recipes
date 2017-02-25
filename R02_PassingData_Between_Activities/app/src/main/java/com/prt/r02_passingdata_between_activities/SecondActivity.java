package com.prt.r02_passingdata_between_activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    // Getting the data from MainActivity
        // get the data passed in using getStringExtra()
        Toast.makeText(this, getIntent().getStringExtra("str1"),
                Toast.LENGTH_SHORT).show();

        // get the data passed in using getIntExtra()
        Toast.makeText(this, Integer.toString(
                getIntent().getIntExtra("str1", 0)),
                Toast.LENGTH_SHORT).show();


        // get the Bundle object passed in
        Bundle bundle = getIntent().getExtras();

        // get the data using the getString()
        Toast.makeText(this, bundle.getString("str2"),
                Toast.LENGTH_SHORT).show();

        // get the data using the getInt() method
        Toast.makeText(this, Integer.toString(bundle.getInt("age2")),
                Toast.LENGTH_SHORT).show();
    }


    // Passing the data back to MainActivity
    public void onClick(View view) {
        // use an Intent object to return data
        Intent intent = new Intent();

        // use the putExtra() method to return some value
        intent.putExtra("age3", 45);

        // use the setData() method to return some value
        intent.setData(Uri.parse("https://github.com/PrtLn/Android_Cookbook_Recipes"));

        // set the result with OK and the Intent object
        setResult(RESULT_OK, intent);

        finish();
    }
}
