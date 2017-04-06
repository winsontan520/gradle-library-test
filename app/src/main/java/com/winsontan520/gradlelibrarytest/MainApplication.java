package com.winsontan520.gradlelibrarytest;

import android.app.Application;

import com.winsontan520.winsongradlelibrary.WinsonGradleLibrary;

/**
 * Created by Winson Tan on 4/1/17.
 */

public class MainApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();

        WinsonGradleLibrary.init(this);
    }
}
