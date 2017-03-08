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

public class AdvancedCustomArrayAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] cities;
    private final Integer[] imageIds;

    public AdvancedCustomArrayAdapter(Activity context,
                                      String[] cities,
                                      Integer[] imageIds) {
        super(context, R.layout.leftrowlayout2, cities);
        this.context = context;
        this.cities = cities;
        this.imageIds = imageIds;
    }

    static class ViewContainer {
        public ImageView imageView;
        public TextView txtTitle;
        public TextView txtDescription;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewContainer viewContainer;
        View rowView = convertView;

        // print the index of the row to examine
        Log.d("CustomArrayAdapter", String.valueOf(position));

        // if the row is displayed for the first time
        if (rowView == null) {

            Log.d("CustomArrayAdapter", "New");
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.leftrowlayout2, null, true);

            // create a view container object
            viewContainer = new ViewContainer();

            // get the references to all the views in the row
            viewContainer.txtTitle = (TextView)
                    rowView.findViewById(R.id.txtCityName);
            viewContainer.txtDescription = (TextView)
                    rowView.findViewById(R.id.txtDescription);
            viewContainer.imageView = (ImageView)
                    rowView.findViewById(R.id.icon);

            // assign the view container to the rowView
            rowView.setTag(viewContainer);
        } else {

            // view was previously created; can recycle
            Log.d("CustomArrayAdapter", "Recycling");
            // retrieve the previously assigned tag to get a reference to all the views;
            viewContainer = (ViewContainer) rowView.getTag();
        }

        // customize the content ogf each row based on position
        viewContainer.txtTitle.setText(cities[position]);
        viewContainer.txtDescription.setText(cities[position] + "...Some description here...");
        viewContainer.imageView.setImageResource(imageIds[position]);

        return rowView;
    }
}
