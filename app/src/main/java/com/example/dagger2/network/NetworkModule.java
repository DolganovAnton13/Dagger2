package com.example.dagger2.network;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }

}