package com.prt.r03_passing_objects_between_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Pikalova Lena on 2/26/2017.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // get the custom object passed in
        MyCustomClass obj = (MyCustomClass)
                getIntent().getSerializableExtra("MyObject");
        Toast.makeText(this, obj.Name(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, obj.Email(), Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        Intent intent = new
                Intent("com.prt.r03_passing_objects_between_activities.MainActivity");

        intent.putExtra("str", "request is done");

        setResult(RESULT_OK, intent);
        finish();
    }
}
