package com.example.firstapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button creation
        Button B = findViewById(R.id.buttonNamefield);
        Button B2 = findViewById(R.id.buttonSearch);

        // Setting onClick listeners for the created buttons
        B.setOnClickListener(this);
        B2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Click event works",Toast.LENGTH_SHORT).show();
        switch (view.getId()) {
            case R.id.buttonNamefield:
                Toast.makeText(this, "Click event works",Toast.LENGTH_SHORT).show();
                System.out.println("INDE I CASE button");
                EditText mEdit;
                TextView mText;
                String mNavn;
                TextView tv = findViewById(R.id.buttonNamefield);
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
                Toast.makeText(this, "Click event works",Toast.LENGTH_SHORT).show();
                System.out.println("INDE I CASE buttonSearch");
                EditText ET = findViewById(R.id.websearchText);
                WebView WV = findViewById(R.id.webview);
                WV.setWebViewClient(new WebViewClient());
                WV.loadUrl("https://" + ET.getText().toString());
                break;
        }

        System.out.println("Det fungerede!");
        Log.d("MainActivity", "Det fungerede!");

    }
}