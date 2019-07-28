package com.example.a86066.appmvptaskap.view;

import com.example.a86066.appmvptaskap.base.BaseView;
import com.example.a86066.appmvptaskap.bean.LoginBean;

public interface LoginView extends BaseView<LoginBean,String> {
    @Override
    void onSuucess(LoginBean loginBean);

    @Override
    void onFail(String s);
}
