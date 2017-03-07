package com.prt.r29_creating_custom_listviews;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

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

        this.setListAdapter(new ArrayAdapter<String>(
                this,
                R.layout.leftrowlayout,
                R.id.txtCitiesName,
                cities));
    }
}
