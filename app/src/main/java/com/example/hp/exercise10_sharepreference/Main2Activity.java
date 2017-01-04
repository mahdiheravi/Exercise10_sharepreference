package com.example.hp.exercise10_sharepreference;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Setting mysetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent Myintent = getIntent();
        mysetting = new Setting();

        mysetting = (Setting) Myintent.getParcelableExtra("setting");
        Log.d("mahdi", mysetting.getThemecolor());
        if (mysetting.getThemecolor()=="BLUE")
            setTheme(R.style.Theme_MyBLUETheme);
        if (mysetting.getThemecolor()=="RED")
            setTheme(R.style.Theme_MyREDTheme);
        if (mysetting.getThemecolor()=="GREEN")
            setTheme(R.style.Theme_MyGreenTheme);
        setContentView(R.layout.activity_main2);
        Button btnred = (Button) findViewById(R.id.btnred);
        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTheme("RED");
                recreate();
            }
        });

        Button btngreen = (Button) findViewById(R.id.btngreen);
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTheme("GREEN");
                recreate();
            }
        });
        Button btnblue = (Button) findViewById(R.id.btnblue);

        btnblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTheme("BLUE");
                recreate();
            }
        });

        TextView mytext = (TextView) findViewById(R.id.textView);
        Button btnlogout = (Button) findViewById(R.id.btnlogout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pref mypref = new Pref(Main2Activity.this);

                Setting mysetting = new Setting();
                mysetting.setUsername("");
                mysetting.setPassword("");
                mysetting.setThemecolor("");
                mypref.setsetting(mysetting);

                finish();

            }
        });
        mytext.setText(mysetting.getUsername());


    }

    public void changeTheme(String theme) {
        Pref mypref = new Pref(Main2Activity.this);
        mysetting.setThemecolor(theme);
        mypref.setsetting(mysetting);
    }
}
