package com.example.dagger2.login;



import com.example.dagger2.ActivityScope;
import com.example.dagger2.account.AccountManager;
import com.example.dagger2.api.ApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @ActivityScope
    @Provides
    AccountManager provideAccountManager(ApiService apiService) {
        return new AccountManager(apiService);
    }

    @ActivityScope
    @Provides
    LoginActivityPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }

}