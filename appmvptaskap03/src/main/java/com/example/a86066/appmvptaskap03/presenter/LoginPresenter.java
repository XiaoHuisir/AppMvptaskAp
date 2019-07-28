package com.example.a86066.appmvptaskap03.presenter;


import android.text.TextUtils;

import com.example.a86066.appmvptaskap03.bean.LoginBean;
import com.example.a86066.appmvptaskap03.callback.LoginCallback;
import com.example.a86066.appmvptaskap03.dase.BasePresenter;
import com.example.a86066.appmvptaskap03.model.LoginModel;
import com.example.a86066.appmvptaskap03.view.LoginView;

public class LoginPresenter extends BasePresenter<LoginModel, LoginView> implements LoginCallback {

    public void login(String name, String pwd) {
        if (TextUtils.isEmpty(name)) {
            if (view != null) {
                view.error("用户名不能为空");
            }

        }
        if (TextUtils.isEmpty(pwd)) {
            if (view != null) {
                view.error("密码不能为空");
            }
        }

    }


    @Override
    public void onSuucess(LoginBean loginBean) {

    }

    @Override
    public void onFail(String s) {

    }
}
