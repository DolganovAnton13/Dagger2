package com.example.dagger2.folders;

import com.example.dagger2.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = FolderListActivityModule.class)
public interface FolderListActivityComponent {

    void injectFoldersListActivity(FolderListActivity activity);

}
