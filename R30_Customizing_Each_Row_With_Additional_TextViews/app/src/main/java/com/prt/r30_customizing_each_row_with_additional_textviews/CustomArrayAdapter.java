package com.prt.r30_customizing_each_row_with_additional_textviews;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pikalova Lena on 3/8/2017.
 */

public class CustomArrayAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] cities;
    private final Integer[] imageIds;

    public CustomArrayAdapter(Activity context,
                              String[] cities,
                              Integer[] imageIds) {
        super(context, R.layout.leftrowlayout2, cities);
        this.context = context;
        this.cities = cities;
        this.imageIds = imageIds;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // print the index of the row to example
        Log.d("CustomArrayAdapter", String.valueOf(position));

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.leftrowlayout2, null, true);

        // get a reference to all the views on the xml layout
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txtCityName);
        TextView txtDescription = (TextView) rowView.findViewById(R.id.txtDescription);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        // customize the content of each row based on position
        txtTitle.setText(cities[position]);
        txtDescription.setText(cities[position] + "...Some descriptions here... ");
        imageView.setImageResource(imageIds[position]);

        return rowView;
    }
}
