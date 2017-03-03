package com.prt.r20_using_fragmentlayout_for_view_positioning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int count = 1;
    FrameLayout frame;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame = (FrameLayout) findViewById(R.id.framelayout);
    }

    public void btnClick(View view) {
        // hide the current one
        imageView = (ImageView) frame.findViewWithTag(String.valueOf(count));
        imageView.setVisibility(View.INVISIBLE);

        // go to the next image
        count++;
        if (count > 3) {
            count = 1;
        }

        // show the next image
        imageView = (ImageView) frame.findViewWithTag(String.valueOf(count));
        imageView.setVisibility(View.VISIBLE);
    }
}
