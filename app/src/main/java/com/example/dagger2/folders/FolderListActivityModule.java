package com.example.dagger2.folders;

import com.example.dagger2.ActivityScope;
import com.example.dagger2.mail.MailManager;

import dagger.Module;
import dagger.Provides;

@Module
public class FolderListActivityModule {

    @ActivityScope
    @Provides
    public FolderListActivityPresenter provideFoldersListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}
