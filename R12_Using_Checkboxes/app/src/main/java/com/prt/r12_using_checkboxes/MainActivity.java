package com.prt.r12_using_checkboxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // handled the CheckBox
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkAutosave);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    Toast.makeText(getBaseContext(),
                            "CheckBox is checked!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(),
                            "CheckBox is unchecked!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
