package com.prt.r10_using_image_buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding text to Button 6 programmatically
        Button bttn = (Button) findViewById(R.id.imageTextButton6);
        bttn.setText("Android");
        bttn.setCompoundDrawablesWithIntrinsicBounds(
                0,                        // left
                R.drawable.ic_launcher,   // top
                0,                        // right
                0);                       // bottom
    }
}
