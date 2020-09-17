package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button B = findViewById(R.id.button);
        B.setOnClickListener(this);

        Button B2 = findViewById(R.id.buttonSearch);
        B2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                System.out.println("INDE I CASE button");
                EditText mEdit;
                TextView mText;
                String mNavn;
                TextView tv = findViewById(R.id.button);
                tv.setText("BANKER");

                // Getting input from textfield
                mEdit = findViewById(R.id.namefield);
                mNavn = mEdit.getText().toString();
                if (mNavn.contains("Velkommen ")) {
                    mNavn = mNavn.replaceAll("Velkommen ", "");
                }
                // Using input to display a welcome message
                mText = findViewById(R.id.namefield);
                mText.setText("Velkommen " + mNavn);
                break;

            case R.id.buttonSearch:
                System.out.println("INDE I CASE buttonSearch");
                EditText ET = findViewById(R.id.websearchText);
                WebView WV = findViewById(R.id.webView);
                WV.loadUrl(ET.toString());
                setContentView(WV);
//                WV.loadUrl("https://" + ET.toString());
                break;
        }

        System.out.println("Det fungerede!");
        Log.d("MainActivity", "Det fungerede!");

        // Changes the text on the button itself.

    }
}