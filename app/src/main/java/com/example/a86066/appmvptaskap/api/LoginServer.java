package com.example.a86066.appmvptaskap.api;

import com.example.a86066.appmvptaskap.bean.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginServer {
    String  baseUrl="http://yun918.cn/study/public/index.php/";
    @POST("login")
    @FormUrlEncoded
    Observable<LoginBean> login(@Field("username")String username,@Field("password")String password);
}
