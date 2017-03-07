package com.prt.r26_displaying_list_of_items_using_listview;

import android.app.ListActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        // List View
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cities));
    }

    public void onListItemClick(ListView parent, View view,
                                int position, long id) {
        Toast.makeText(this, "You have selected " + cities[position],
                Toast.LENGTH_SHORT).show();
    }
}
