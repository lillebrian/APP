package com.example.firstapplication;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HovedmenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hovedmenu);

        Button B = findViewById(R.id.button2);
        B.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        setContentView(R.layout.activity_main);

    }
}
