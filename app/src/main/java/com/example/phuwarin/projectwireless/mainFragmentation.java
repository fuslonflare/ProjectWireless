package com.example.phuwarin.projectwireless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mainFragmentation extends AppCompatActivity implements My_Fragment_Top.TopListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_main);
    }

    @Override
    public void createMessage(String topMessage, String bottomMessage) {
        My_Fragment_Bottom bottomFragment =  (My_Fragment_Bottom) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMessageText(topMessage, bottomMessage);
    }
}
