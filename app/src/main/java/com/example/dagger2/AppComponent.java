package com.example.dagger2;

import com.example.dagger2.api.ApiModule;
import com.example.dagger2.login.LoginActivityComponent;
import com.example.dagger2.mail.MailComponent;
import com.example.dagger2.mail.MailModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

    LoginActivityComponent createLoginComponent();

    MailComponent createMailComponent(MailModule mailModule);
}