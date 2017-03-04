package com.prt.r24_displaying_dialogs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Pikalova Lena on 3/4/2017.
 */

public class InputNameDialogFragment extends DialogFragment {
    EditText txtName;
    Button btn;
    static String dialogTitle;

    // Interface containing methods to be implemented by calling activity
    public interface InputNameDialogListener {
        void onFinishInputDialog(String inputText);
    }

    public InputNameDialogFragment() {
        // empty constructor required
    }

    // set the title of the dialog window
    public void setDialogTitle(String title) {
        dialogTitle = title;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inputname_dialog, container);

        // get the EditText and Button views
        txtName = (EditText) view.findViewById(R.id.txtNmae);
        btn = (Button) view.findViewById(R.id.btnDone);

        // event handler for the button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // gets the calling activity
                InputNameDialogListener activity =
                        (InputNameDialogListener) getActivity();

                activity.onFinishInputDialog(txtName.getText().toString());
                // dismiss the alert
                dismiss();
            }
        });

        // show the keyboard automatically
        txtName.requestFocus();
        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        // set the title for the dialog
        getDialog().setTitle(dialogTitle);

        return view;
    }
}
