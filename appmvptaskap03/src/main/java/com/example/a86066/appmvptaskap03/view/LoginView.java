package com.example.a86066.appmvptaskap03.view;

import com.example.a86066.appmvptaskap03.bean.LoginBean;
import com.example.a86066.appmvptaskap03.dase.BaseView;

public interface LoginView extends BaseView<LoginBean,String> {
    @Override
    void seccsec(LoginBean loginBean);

    @Override
    void error(String s);
}
