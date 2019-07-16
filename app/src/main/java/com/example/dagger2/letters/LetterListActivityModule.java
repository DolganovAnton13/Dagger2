package com.example.dagger2.letters;

import com.example.dagger2.ActivityScope;
import com.example.dagger2.datatype.Folder;
import com.example.dagger2.mail.MailManager;

import dagger.Module;
import dagger.Provides;

@Module
public class LetterListActivityModule {

    private Folder folder;

    public LetterListActivityModule(Folder folder) {
        this.folder = folder;
    }

    @ActivityScope
    @Provides
    public Folder provideFolder() {
        return folder;
    }

    @ActivityScope
    @Provides
    public LetterListActivityPresenter provideLettersListActivityPresenter(Folder folder, MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}
