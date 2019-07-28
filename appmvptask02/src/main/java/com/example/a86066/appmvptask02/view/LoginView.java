package com.example.a86066.appmvptask02.view;

import com.example.a86066.appmvptask02.base.BaseView;
import com.example.a86066.appmvptask02.bean.LoginBean;

public interface LoginView  extends BaseView<LoginBean,String> {
    @Override
    void seccsec(LoginBean loginBean);

    @Override
    void inEnit(String s);
}
