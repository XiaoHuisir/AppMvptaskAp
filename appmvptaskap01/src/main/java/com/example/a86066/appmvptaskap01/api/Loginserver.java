package com.example.a86066.appmvptaskap01.api;

import com.example.a86066.appmvptaskap01.bean.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Loginserver {

    String  baseUrl="http://yun918.cn/study/public/index.php/";
    @POST("login")
    @FormUrlEncoded
    Observable<LoginBean>  login(@Field("username") String name, @Field("password") String password);
}
