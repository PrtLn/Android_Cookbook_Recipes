package com.prt.r14_using_autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] cities = {
            "New York",
            "London",
            "Toronto",
            "Paris",
            "Stockholm",
            "San Francisco",
            "Singapore",
            "Hong Kong",
            "Chicago",
            "Tokyo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line, cities);

        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.textCities);

        textView.setThreshold(3);
        textView.setAdapter(adapter);
    }
}
