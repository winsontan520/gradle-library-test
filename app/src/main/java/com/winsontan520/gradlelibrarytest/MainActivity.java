package com.winsontan520.gradlelibrarytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.winsontan520.winsongradlelibrary.WinsonGradleLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WinsonGradleLibrary.startHacking();
    }
}
