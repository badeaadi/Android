package com.example.myapplication.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Spinner extends AppCompatActivity {

    private List<String> mColors;
    private Spinner mSpinnerColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //initView();

    }

    private void setColors() {
        mColors = new ArrayList<>();
        mColors.add("Verde");
        mColors.add("Albastru");
        mColors.add("Siclam");
        mColors.add("Magneta");
        mColors.add("Roz");
        mColors.add("Galben");
    }/*
    private void initView() {
        mSpinnerColors = findViewById(R.id.spinner_colors);
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<>(SpinnerActivity.this, android.R.layout.simple_list_item_1);
    }

    private void setAdapter() {
        mSpinnerColors.setAdapter(getAdapter());
    }*/

}
