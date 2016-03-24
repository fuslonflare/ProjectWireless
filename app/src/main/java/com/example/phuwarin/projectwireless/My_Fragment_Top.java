package com.example.phuwarin.projectwireless;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class My_Fragment_Top extends Fragment {

    private static EditText editText1;
    private static EditText editText2;

    TopListener activityCommander;

    public interface TopListener {
        public void createMessage (String topMessage, String bottomMessage);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            activityCommander = (TopListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_my_fragment_top, container, false);

        editText1 = (EditText)view.findViewById(R.id.editText_input1);
        editText2 = (EditText)view.findViewById(R.id.editText_input2);
        final Button button = (Button)view.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickMe(v);
            }
        });
        return view;
    }

    public void clickMe(View view) {
        activityCommander.createMessage(editText1.getText().toString(), editText2.getText().toString());
    }
}
