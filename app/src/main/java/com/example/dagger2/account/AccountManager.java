package com.example.dagger2.account;

import com.example.dagger2.api.ApiService;
import com.example.dagger2.datatype.Account;

public class AccountManager {

    private ApiService apiService;

    public AccountManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public Account login(String user, String password) {
        return apiService.login(user, password);
    }

}