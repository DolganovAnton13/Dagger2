package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.app.App;
import com.example.dagger2.network.NetworkUtils;
import com.example.dagger2.storage.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = App.getComponent().getDatabaseHelper();
        networkUtils = App.getComponent().getNetworkUtils();
    }
}
