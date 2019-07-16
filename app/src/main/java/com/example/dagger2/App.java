package com.example.dagger2;

import android.app.Application;

import com.example.dagger2.datatype.Account;
import com.example.dagger2.mail.MailComponent;
import com.example.dagger2.mail.MailModule;

public class App extends Application {

    private static App instance;

    private AppComponent appComponent;
    private MailComponent mailComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appComponent = DaggerAppComponent.create();
    }

    public static App getInstance() {
        return instance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void createMailComponent(Account account) {
        mailComponent = appComponent.createMailComponent(new MailModule(account));
    }

    public MailComponent getMailComponent() {
        return mailComponent;
    }

    public void releaseMailComponent() {
        mailComponent = null;
    }
}