package com.example.phuwarin.projectwireless;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class Preferences extends AppCompatActivity {

    EditText edit_email;

    private static final String MyPREFERENCES = "MyPrefs" ;
    private static final String TAG = "PreferenceTAG";
    private static final String EMAIL = "Email";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        edit_email = (EditText)findViewById(R.id.editText_email);

        edit_email.setText(sharedPreferences.getString(EMAIL, ""));

        edit_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor.putString(EMAIL, s.toString());
                editor.commit();
            }
        });


    }
}
