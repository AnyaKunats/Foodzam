package com.example.logoped583st.foodzam;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.example.logoped583st.foodzam.di.App.AppModule;


/**
 * Created by logoped583st on 17.2.18.
 */

public class App extends Application {

    @SuppressLint("StaticFieldLeak")
    static Context context;
    static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        App.appComponent= DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }

}
