package com.example.logoped583st.foodzam;

import com.example.logoped583st.foodzam.di.App.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by logoped583st on 17.2.18.
 */
@Singleton
@Component(modules = AppModule.class)
interface AppComponent {

}
