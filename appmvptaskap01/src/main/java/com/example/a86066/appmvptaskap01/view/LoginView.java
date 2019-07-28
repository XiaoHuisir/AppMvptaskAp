package com.example.a86066.appmvptaskap01.view;

import com.example.a86066.appmvptaskap01.base.BaseView;
import com.example.a86066.appmvptaskap01.bean.LoginBean;

public interface LoginView  extends BaseView<LoginBean ,String> {
    @Override
    void onSuucess(LoginBean loginBean);

    @Override
    void onFail(String s);
}
