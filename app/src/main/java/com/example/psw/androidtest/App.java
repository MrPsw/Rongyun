package com.example.psw.androidtest;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Administrator on 2018\3\14 0014.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化 融云
         */
        RongIM.init(this);
    }
}
