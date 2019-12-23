package com.example.financial.util

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitTool private constructor(){
    companion object {
        val tool:RetrofitTool by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { RetrofitTool() }
        lateinit var retrofit: Retrofit
    }

    fun init(){
        retrofit = Retrofit.Builder().baseUrl(FinalData().baseurl).client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }


}