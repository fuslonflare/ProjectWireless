package com.example.phuwarin.projectwireless;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Brown extends AppCompatActivity {

    private Button go_to_green;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brown);

        go_to_green = (Button) findViewById(R.id.green_button);
        go_to_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Green.class);
                startActivity(intent);
            }
        });
    }
}
