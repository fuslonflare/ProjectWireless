package com.example.phuwarin.projectwireless;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class My_Fragment_Bottom extends Fragment {

    TextView textView_hello;
    TextView textView_world;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_my_fragment_bottom, container, false);
        textView_hello = (TextView) view.findViewById(R.id.textView_bottom);
        textView_world = (TextView) view.findViewById(R.id.textView_bottom2);
        return view;
    }

    public void setMessageText (String a, String b) {
        textView_hello.setText(a);
        textView_world.setText(b);
    }
}
