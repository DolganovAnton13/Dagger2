package com.example.dagger2.mail;

import com.example.dagger2.folders.FolderListActivityComponent;
import com.example.dagger2.letters.LetterListActivityComponent;
import com.example.dagger2.letters.LetterListActivityModule;

import dagger.Subcomponent;

@MailScope
@Subcomponent(modules = MailModule.class)
public interface MailComponent {

    FolderListActivityComponent createFoldersListActivityComponent();

    LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModule letterListActivityModule);

}