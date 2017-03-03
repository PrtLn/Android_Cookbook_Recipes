package com.prt.r16_using_the_timepicker;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
    }

    public void btnClick(View view) {
        NumberFormat formatter = new DecimalFormat("00");
        int hour;
        String minute;
        if (Build.VERSION.SDK_INT >= 23) {
            hour = timePicker.getHour();
            minute = formatter.format(timePicker.getMinute());
        } else {
            hour = timePicker.getCurrentHour();
            minute = formatter.format(timePicker.getCurrentMinute());
        }
        Toast.makeText(getBaseContext(),
                "Time selected: " + hour + ":" + minute,
                Toast.LENGTH_SHORT).show();
    }
}
