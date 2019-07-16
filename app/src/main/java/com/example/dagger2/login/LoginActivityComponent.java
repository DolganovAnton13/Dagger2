package com.example.dagger2.login;

import com.example.dagger2.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {

    void injectLoginActivity(LoginActivity activity);

}
