package com.prt.r09_using_buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button 3 handled by an inner class OnClickListener
        Button bttn = (Button) findViewById(R.id.button3);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Button 3 was clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Button 4 and 5 handled by an anonymous class OnClickListener
        Button bttn4 = (Button) findViewById(R.id.button4);
        bttn4.setOnClickListener(bttnListener);

        Button bttn5 = (Button) findViewById(R.id.button5);
        bttn5.setOnClickListener(bttnListener);
    }

    // create an anonymous class to act as a button click listener
    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " was clicked!",
                    Toast.LENGTH_SHORT).show();
        }
    };

    // the method that handles Button 1 and Button 2
    public void onClick(View view) {
        Button bttn = (Button) view;
        Toast.makeText(this,bttn.getText() + " was clicked!",
                Toast.LENGTH_SHORT).show();
    }

    // the method that handles ToggleButton
    public void onToggle(View view) {
        ToggleButton bttn = (ToggleButton) view;
        Toast.makeText(this, "Toggle mode: " + bttn.isChecked(),
                Toast.LENGTH_SHORT).show();
    }
}
