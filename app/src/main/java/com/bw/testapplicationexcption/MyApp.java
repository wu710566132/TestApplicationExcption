package com.bw.testapplicationexcption;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by 2016 on 2017/7/12.
 */

public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }
    }

