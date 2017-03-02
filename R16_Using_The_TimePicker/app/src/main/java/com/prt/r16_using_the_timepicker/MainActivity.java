package com.prt.r16_using_the_timepicker;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void btnClick(View view) {
        NumberFormat formatter = new DecimalFormat("00");
        Toast.makeText(getBaseContext(),
                "Time selected:" +
        timePicker.getHour() +
        ":" + formatter.format(timePicker.getMinute()),
                Toast.LENGTH_SHORT).show();

        /*
        if (Build.VERSION.SDK_INT >= 23 )
            myTimePickerView.getHour();
        else
            myTimePickerView.getCurrentHour();
        */
    }
}
