package com.example.hp.exercise10_sharepreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnenter = (Button) findViewById(R.id.btnenter);
        EditText txtusername = (EditText) findViewById(R.id.txtusername);
        EditText txtpass = (EditText) findViewById(R.id.txtpass);
        

    }
}
