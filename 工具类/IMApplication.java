package com.example.huanxin;

import android.app.Application;
import android.content.Context;

import com.example.huanxin.model.Model;

public class IMApplication  extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        Model.getInstance().init(context);



    }
    public static Context getGlobalApplication(){

        return context;
    }
}
