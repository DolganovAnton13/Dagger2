package com.example.dagger2.folders;

import com.example.dagger2.mail.MailManager;

public class FolderListActivityPresenter {

    private FolderListActivity activity;
    private MailManager mailManager;

    FolderListActivityPresenter(MailManager mailManager) {
        this.mailManager = mailManager;
    }

    public void setActivity(FolderListActivity activity) {
        this.activity = activity;
    }

    public void loadFolders() {
        activity.showFolders(mailManager.getFolders());
    }
}