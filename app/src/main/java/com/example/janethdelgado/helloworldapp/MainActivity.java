package com.example.janethdelgado.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.textButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorTextSecondary));
            }
        });

        findViewById(R.id.bgButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Background).setBackgroundColor(getResources().getColor(R.color.colorBGSecondary));
            }
        });

        findViewById(R.id.stringButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab text the user inputs
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //put text into text view on button click
                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Janeth!");
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

            }
        });

        findViewById(R.id.Background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset text color
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorTextPrimary));

                //reset bg color
                findViewById(R.id.Background).setBackgroundColor(getResources().getColor(R.color.colorBGPrimary));

                //reset text string
                ((TextView) findViewById(R.id.textView)).setText("Hello from Janeth!");
            }
        });

        findViewById(R.id.textChangeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setText("Android is Awesome!");
            }
        });
    }
}
