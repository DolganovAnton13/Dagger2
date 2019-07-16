package com.example.dagger2.letters;

import com.example.dagger2.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = LetterListActivityModule.class)
public interface LetterListActivityComponent {

    void injectLettersListActivity(LetterListActivity activity);

}