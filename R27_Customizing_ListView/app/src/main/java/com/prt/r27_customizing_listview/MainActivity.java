package com.prt.r27_customizing_listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
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

        ListView listView = getListView();
//        listView.setChoiceMode(ListView.CHOICE_MODE_NONE);
//        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        
        // determines the item when printing by keyboard
        listView.setTextFilterEnabled(true);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_checked, cities));
    }

    public void onListItemClick(ListView parent, View view,
                                int position, long id) {
        CheckedTextView item = (CheckedTextView) view;
        Toast.makeText(this, cities[position] + " checked : " +
                        !item.isChecked(), Toast.LENGTH_SHORT).show();
    }
}
