package com.example.a86066.appmvptaskap01.presenter;

import android.text.TextUtils;
import android.util.Log;

import com.example.a86066.appmvptaskap01.base.BasePresenter;
import com.example.a86066.appmvptaskap01.bean.LoginBean;
import com.example.a86066.appmvptaskap01.callback.LoginCallback;

import static org.greenrobot.eventbus.EventBus.TAG;

public class LoginPresenter extends BasePresenter implements LoginCallback {
//    //    public void login(String name, String pwd) {
//        if (TextUtils.isEmpty(name)) {
//            if (view != null) {
//                view.onFail("name不能为空");
//            }
//            return;
//        }
//        if (TextUtils.isEmpty(pwd)) {
//            if (view != null) {
//                view.onFail("密码不能为空");
//            }
//            return;
//        }
//
//
//        if (model != null) {
//            model.login(name, pwd, this);
//        }
//    }
//
//    @Override
//    public void onSuccess(LoginBean loginBean) {
//        if (view != null) {
//            view.onSuccess(loginBean);
//        }
//    }
    public  void   login(String name ,String pwd){
        
        if (TextUtils.isEmpty(name)){
            Log.i(TAG, "login: username不能为空");
        }
        if (TextUtils.isDigitsOnly(pwd)){
            Log.i(TAG, "login: pwd不能为空");

        }

    }

    @Override
    public void seccssec(LoginBean loginBean) {

    }

    @Override
    public void error(String error) {

    }
}
