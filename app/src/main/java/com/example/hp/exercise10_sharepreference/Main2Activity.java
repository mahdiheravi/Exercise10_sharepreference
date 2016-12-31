package com.example.hp.exercise10_sharepreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent Myintent = getIntent();
        String Themecolor;
        Themecolor = Myintent.getStringExtra("theme");
        Button btnred = (Button) findViewById(R.id.btnenter);
        Button btngreen = (Button) findViewById(R.id.btngreen);
        Button btnblue = (Button) findViewById(R.id.btnblue);
        TextView mytext = (TextView) findViewById(R.id.textView);
        mytext.setText(Themecolor);


    }
}
