package com.example.a86066.appmvptaskap.model;

import com.example.a86066.appmvptaskap.api.LoginServer;
import com.example.a86066.appmvptaskap.base.BaseModel;
import com.example.a86066.appmvptaskap.bean.LoginBean;
import com.example.a86066.appmvptaskap.callback.LoginCallback;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginModel extends BaseModel {
    public void login(String name, String password, final LoginCallback callback) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LoginServer.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        LoginServer loginServer = retrofit.create(LoginServer.class);
        Observable<LoginBean> observable = loginServer.login(name, password);

        observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean value) {
                        callback.onSuucess(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onFail("网络请求失败" + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
