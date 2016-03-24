package com.example.phuwarin.projectwireless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Detective extends AppCompatActivity {

    Spinner spinner;
    ImageView imageView;
    TextView textView;
    int choose;
    private static final String TAG = "DetectiveTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detective);

        spinner = (Spinner)findViewById(R.id.lollipop);
        imageView = (ImageView)findViewById(R.id.marshmallow);
        textView = (TextView)findViewById(R.id.textView);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                choose = spinner.getSelectedItemPosition();
                Log.d(TAG, "choose = " + choose);
                switch (choose) {
                    case 0:
                        imageView.setImageResource(R.drawable.detective_1);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.detective_2);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.detective_3);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.detective_4);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState");
        //outState.putInt("temporary", choose);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState");
        //choose = savedInstanceState.getInt("temporary");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }
}
