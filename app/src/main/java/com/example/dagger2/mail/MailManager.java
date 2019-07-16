package com.example.dagger2.mail;



import com.example.dagger2.api.ApiService;
import com.example.dagger2.datatype.Account;
import com.example.dagger2.datatype.Folder;
import com.example.dagger2.datatype.Letter;

import java.util.List;

public class MailManager {

    private Account account;
    private ApiService apiService;

    public MailManager(Account account, ApiService apiService) {
        this.account = account;
        this.apiService = apiService;
    }

    public List<Folder> getFolders() {
        return apiService.getFolders(account);
    }

    public List<Letter> getLetters(Folder folder) {
        return apiService.getLetters(folder);
    }
}
