package com.example.hp.exercise10_sharepreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;
/**
 * Created by hp on 12/31/2016.
 */

public class Pref {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context mycontex;
    public static String SettingKey = "setting";
    private static String domain = "myapp";
    public Pref(Context context)
    {
        mycontex = context;
        preferences = mycontex.getSharedPreferences(domain,mycontex.MODE_PRIVATE);
        editor = preferences.edit();
    }
    public Setting getsetting()
    {
        Gson gson  = new Gson();
        Setting output;
        output = gson.fromJson(preferences.getString(SettingKey,""),Setting.class);
        return  output;
    }
    public void setsetting(Setting input)
    {
        Gson gson  = new Gson();
        editor.putString(SettingKey,gson.toJson(input));
        editor.commit();
    }
    public void initialize()
    {

        Setting empty =  new Setting();

        empty.setUsername("");
        empty.setUsername("");
        empty.setThemecolor("");
        Gson gson  = new Gson();

        editor.putString(SettingKey,gson.toJson(empty));

        editor.commit();


    }



}
