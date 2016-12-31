package com.example.hp.exercise10_sharepreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
        final Pref mypref = new Pref(MainActivity.this);
        final Setting mysetting = new Setting();
        mysetting.setUsername(txtusername.getText().toString());
        mysetting.setPassword(txtpass.getText().toString());
        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mypref.setsetting(mysetting);

            }
        });





      //  mypref.initialize();

       mysetting.setUsername(mypref.getsetting().getUsername());
     // if (mysetting.getUsername()=="")






    }
}
