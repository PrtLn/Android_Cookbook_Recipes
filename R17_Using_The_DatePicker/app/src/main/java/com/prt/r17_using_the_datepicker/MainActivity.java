package com.prt.r17_using_the_datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
    }

    public void btnClick(View view) {
        Toast.makeText(getBaseContext(),
                "Date selected: " + (datePicker.getMonth() + 1) +
                                "/" + datePicker.getDayOfMonth() +
                                "/" + datePicker.getYear(),
                Toast.LENGTH_SHORT).show();
    }
}
