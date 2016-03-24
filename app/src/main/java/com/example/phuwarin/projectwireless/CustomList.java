package com.example.phuwarin.projectwireless;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class CustomList extends ArrayAdapter<String> {

    private int layoutResourceId;
    private List<String> data;
    Activity context2;

    public CustomList(Activity context, int layoutId, List<String> list) {
        super(context,layoutId,list);
        layoutResourceId = layoutId;
        data = list;
        context2=context;
       // super(context, layoutResourceId, data);

    }

    @Override
    public View getView(int index, View row, ViewGroup parent) {
        //row = context2.getLayoutInflater().inflate()
        return row;
    }
}
