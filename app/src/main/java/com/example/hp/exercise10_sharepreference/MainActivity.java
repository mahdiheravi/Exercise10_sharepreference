package com.example.hp.exercise10_sharepreference;

import android.content.Intent;
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
        Setting mysetting = new Setting();
        mysetting = mypref.getsetting();
        if (mysetting.getUsername()=="" && mysetting.getPassword()=="")
        {
            Intent Myintent = new Intent(MainActivity.this, Main2Activity.class);
            Myintent.putExtra("theme",mysetting.getThemecolor());
            startActivity(Myintent);
        }
        else
        {
            mysetting.setUsername(txtusername.getText().toString());
            mysetting.setPassword(txtpass.getText().toString());

            final Setting finalMysetting = mysetting;
            btnenter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mypref.setsetting(finalMysetting);

                }
            });
        }






      //  mypref.initialize();

      // mysetting.setUsername(mypref.getsetting().getUsername());
     // if (mysetting.getUsername()=="")






    }
    public Boolean IsLogined()
    {
         Pref mypref = new Pref(MainActivity.this);
         Setting mysetting = new Setting();
        mysetting = mypref.getsetting();
        if (mysetting.getUsername()=="" && mysetting.getPassword()=="")
            return false;
        else
            return true;


    }
}
