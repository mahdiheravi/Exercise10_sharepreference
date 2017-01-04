package com.example.hp.exercise10_sharepreference;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hp on 12/31/2016.
 */

public class Setting implements Parcelable{
    private  String username;
    private String password;
    private String themecolor;

    protected Setting(Parcel in) {
        username = in.readString();
        password = in.readString();
        themecolor = in.readString();
    }

    public static final Creator<Setting> CREATOR = new Creator<Setting>() {
        @Override
        public Setting createFromParcel(Parcel in) {
            return new Setting(in);
        }

        @Override
        public Setting[] newArray(int size) {
            return new Setting[size];
        }
    };

    public Setting() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getThemecolor() {
        return themecolor;
    }

    public void setThemecolor(String themecolor) {
        this.themecolor = themecolor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
        dest.writeString(themecolor);
    }
}
