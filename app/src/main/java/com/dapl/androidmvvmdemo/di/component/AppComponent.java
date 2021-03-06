package com.dapl.androidmvvmdemo.di.component;

import android.app.Application;

import com.dapl.androidmvvmdemo.AppController;
import com.dapl.androidmvvmdemo.di.builder.ActivityBuilder;
import com.dapl.androidmvvmdemo.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;


@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }

    void inject(AppController app);

}
