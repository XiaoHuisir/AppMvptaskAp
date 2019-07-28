package com.example.a86066.appmvptaskap01.model;

import com.example.a86066.appmvptaskap01.api.Loginserver;
import com.example.a86066.appmvptaskap01.base.BaseModel;
import com.example.a86066.appmvptaskap01.bean.LoginBean;
import com.example.a86066.appmvptaskap01.callback.LoginCallback;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginModel extends BaseModel {

public   void  login(String name, String  pwd, final LoginCallback loginCallback){


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Loginserver.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();
    Observable<LoginBean> observable = retrofit.create(Loginserver.class).login(name, pwd);
    observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Observer<LoginBean>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(LoginBean loginBean) {
                loginCallback.seccssec(loginBean);
                }

                @Override
                public void onError(Throwable e) {
                loginCallback.error("网络请求失败"+e.getMessage());
                }

                @Override
                public void onComplete() {

                }
            });
}

}
