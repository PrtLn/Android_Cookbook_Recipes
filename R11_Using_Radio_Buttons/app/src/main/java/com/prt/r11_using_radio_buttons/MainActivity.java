package com.prt.r11_using_radio_buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // handled the RadioButton
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rgbGp1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rgb1);
                if (rb1.isChecked()) {
                    Toast.makeText(getBaseContext(),
                            "Option 1 checked!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(),
                            "Option 2 checked!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
