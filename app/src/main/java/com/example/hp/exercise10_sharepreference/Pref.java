package com.example.hp.exercise10_sharepreference;

import android.content.Context;
import android.content.SharedPreferences;

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


}
