package com.liucr.gotocode;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new LocationPlugin().init(this);
    }
}
