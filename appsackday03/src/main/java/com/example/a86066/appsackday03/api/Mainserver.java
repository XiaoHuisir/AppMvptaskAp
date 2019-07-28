package com.example.a86066.appsackday03.api;

import com.example.a86066.appsackday03.dean.Userbean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Mainserver {
    //    http://gank.io/api/data/%E7%A6%8F%E5%88%A9/20/1
    String Baseurl = "http://gank.io/api/";

    @GET("data/%E7%A6%8F%E5%88%A9/20/1")
    Observable<Userbean> getsetver();
}
