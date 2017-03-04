package com.prt.r24_displaying_dialogs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Pikalova Lena on 3/4/2017.
 */

public class YesNoDialogFragment extends DialogFragment {
    Button btnYes, btnNo;
    static String dialogTitle;

    // Interface containing methods to be implemented by calling activity
    public interface YesNoDialogListener {
        void  onFinishYesNoDialog(boolean state);
    }

    public YesNoDialogFragment() {
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
        View view = inflater.inflate(R.layout.fragment_yes_no_dialog, container);

        // get the Button views
        btnYes = (Button) view.findViewById(R.id.btnYes);
        btnNo = (Button) view.findViewById(R.id.btnNo);

        btnYes.setOnClickListener(btnListener);
        btnNo.setOnClickListener(btnListener);

        // set the title for the dialog
        getDialog().setTitle(dialogTitle);

        return view;
    }

    // create an anonymous class to act as a button click listener
    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // get the calling activity
            YesNoDialogListener activity = (YesNoDialogListener) getActivity();
            boolean state = ((Button) v).getText().toString()
                    .equals("Yes") ? true : false;
            activity.onFinishYesNoDialog(state);

            // dismiss the alert
            dismiss();
        }
    };
}
