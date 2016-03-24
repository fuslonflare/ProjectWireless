package com.example.phuwarin.projectwireless;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Green extends AppCompatActivity {

    private Button go_to_brown;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);

        go_to_brown = (Button) findViewById(R.id.brown_button);
        go_to_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Brown.class);
                startActivity(intent);
            }
        });
    }
}
