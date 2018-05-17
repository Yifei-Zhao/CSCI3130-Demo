package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    private EditText edit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v) {
        edit = findViewById(R.id.editText);
        text = findViewById(R.id.textView);
        text.setText(edit.getText());
    }
}





























