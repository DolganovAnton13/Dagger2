package com.example.dagger2.login;


import com.example.dagger2.account.AccountManager;
import com.example.dagger2.datatype.Account;

public class LoginActivityPresenter {

    private LoginActivity activity;
    private AccountManager accountManager;

    public LoginActivityPresenter(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void setActivity(LoginActivity activity) {
        this.activity = activity;
    }

    void login(String user, String password) {
        Account account = accountManager.login(user, password);
        activity.showMailForAccount(account);
    }

}