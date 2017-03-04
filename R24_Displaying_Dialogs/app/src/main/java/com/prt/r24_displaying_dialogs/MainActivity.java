package com.prt.r24_displaying_dialogs;

import com.prt.r24_displaying_dialogs.InputNameDialogFragment.InputNameDialogListener;
import com.prt.r24_displaying_dialogs.YesNoDialogFragment.YesNoDialogListener;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends FragmentActivity
            implements InputNameDialogListener, YesNoDialogListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Input Name Dialog
    public void btnShowDialog(View view) {
        showInputNameDialog();
    }

    private void showInputNameDialog() {
        FragmentManager fm = getSupportFragmentManager();
        InputNameDialogFragment inputNameDialog = new InputNameDialogFragment();
        inputNameDialog.setCancelable(false);
        inputNameDialog.setDialogTitle("Enter Name");
        inputNameDialog.show(fm, "input dialog");
    }

    @Override
    public void onFinishInputDialog(String inputText) {
        Toast.makeText(this, "Returned from dialog: " + inputText,
                Toast.LENGTH_SHORT).show();
    }

    // YES/NO Dialog
    public void btnShowYesNoDialog(View view) {
        showYesNoDialog();
    }

    private void showYesNoDialog() {
        FragmentManager fm = getSupportFragmentManager();
        YesNoDialogFragment yesnoDialog = new YesNoDialogFragment();
        yesnoDialog.setCancelable(false);
        yesnoDialog.setDialogTitle("Status change");
        yesnoDialog.show(fm, "yes/no dialog");
    }

    @Override
    public void onFinishYesNoDialog(boolean state) {
        Toast.makeText(this, "Returned from Yes/No dialog: " + state,
                Toast.LENGTH_SHORT).show();
    }
}
