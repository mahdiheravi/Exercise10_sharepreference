package com.example.hp.exercise10_sharepreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnenter = (Button) findViewById(R.id.btnenter);
        final EditText txtusername = (EditText) findViewById(R.id.txtusername);
        final EditText txtpass = (EditText) findViewById(R.id.txtpass);

        final Pref mypref = new Pref(MainActivity.this);

        Setting mysetting = new Setting();

        mysetting = mypref.getsetting();
        Log.d("setting",mysetting.getUsername());
        Log.d("=======","=======");

        if (mysetting.getUsername() != "" && mysetting.getPassword() != "") {

            Intent Myintent = new Intent(MainActivity.this, Main2Activity.class);

            Myintent.putExtra("setting", mysetting);

            startActivity(Myintent);
        } else
        {
            final Setting finalMysetting = mysetting;
            final Setting finalMysetting1 = mysetting;
            btnenter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finalMysetting1.setUsername(txtusername.getText().toString());
                    finalMysetting1.setPassword(txtpass.getText().toString());
                    mypref.setsetting(finalMysetting1);
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                    Intent Myintent2 = new Intent(MainActivity.this, Main2Activity.class);

                    Myintent2.putExtra("setting", finalMysetting1);

                    startActivity(Myintent2);


                }
            });

        }






        //  mypref.initialize();

        // mysetting.setUsername(mypref.getsetting().getUsername());
        // if (mysetting.getUsername()=="")


    }

    public Boolean IsLogined() {
        Pref mypref = new Pref(MainActivity.this);
        Setting mysetting = new Setting();
        mysetting = mypref.getsetting();
        if (mysetting.getUsername() == "" && mysetting.getPassword() == "")
            return false;
        else
            return true;


    }
}
