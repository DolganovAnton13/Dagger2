package com.example.dagger2.app;

import com.example.dagger2.storage.DatabaseHelper;
import com.example.dagger2.storage.StorageModule;
import com.example.dagger2.network.NetworkModule;
import com.example.dagger2.network.NetworkUtils;

import dagger.Component;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();
}