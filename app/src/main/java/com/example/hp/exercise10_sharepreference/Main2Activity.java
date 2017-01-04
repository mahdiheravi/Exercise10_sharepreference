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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent Myintent = getIntent();
        Setting mysetting = new Setting();
        final String[] ThemeColor = new String[1];

        mysetting = (Setting) Myintent.getParcelableExtra("setting");

        Button btnred = (Button) findViewById(R.id.btnred);
        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeColor[0]="RED";
               // Toast.makeText(Main2Activity.this, "RED", Toast.LENGTH_SHORT).show();
            }
        });

        Button btngreen = (Button) findViewById(R.id.btngreen);
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeColor[0]="GREEN";
                //Toast.makeText(Main2Activity.this, "GREEN", Toast.LENGTH_SHORT).show();

            }
        });
        Button btnblue = (Button) findViewById(R.id.btnblue);
        btnblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeColor[0]="BLUE";
               // Toast.makeText(Main2Activity.this, "BLUE", Toast.LENGTH_SHORT).show();
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
                mypref.setsetting(mysetting);

               // Log.d("myintent1", "logout");
                finish();
               // Intent Myintent2 = new Intent(Main2Activity.this, MainActivity.class);
               // startActivity(Myintent2);
                //Log.d("========", "myintent2");

            }
        });
        mytext.setText(mysetting.getUsername());
        // final Setting finalMysetting = mysetting;


    }

    public void changeTheme(String theme, Setting mysetting) {
        Pref mypref = new Pref(Main2Activity.this);
        mysetting.setThemecolor(theme);
        mypref.setsetting(mysetting);
    }
}
