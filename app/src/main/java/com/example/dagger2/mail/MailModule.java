package com.example.dagger2.mail;


import com.example.dagger2.api.ApiService;
import com.example.dagger2.datatype.Account;

import dagger.Module;
import dagger.Provides;

@Module
public class MailModule {

    private Account account;

    public MailModule(Account account) {
        this.account = account;
    }

    @Provides
    public Account provideAccount() {
        return account;
    }

    @Provides
    @MailScope
    MailManager provideMailManager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }

}

