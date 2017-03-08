package com.prt.r30_customizing_each_row_with_additional_textviews;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

    Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // (1) using custom array adapter
//        CustomArrayAdapter adapter = new CustomArrayAdapter(this, cities, imageIDs);
//        setListAdapter(adapter);

        // (2) using custom array adapter (with recycling)
        AdvancedCustomArrayAdapter adapter =
                new AdvancedCustomArrayAdapter(this, cities, imageIDs);
        setListAdapter(adapter);
    }
}
