package com.porawee.finalapp.Service;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {
    private static HttpManager instance;
    public static HttpManager getInstance() {
        if (instance == null)
            instance = new HttpManager();
        return instance;
    }

    private Context mContext;
    private ApiService service;

    private HttpManager() {
        // mContext = Contextor.getInstance().getContext();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.lovedesigner.net/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(ApiService.class);
    }

    public ApiService getService() {
        return service;
    }



}
