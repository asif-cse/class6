package com.masterandroid.myintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

     TextView textView= findViewById(R.id.tvDisplay);

     textView.setText(getIntent().getExtras().getString("str_key"));

    }
}
