package com.example.a86066.appmvptaskap03.callback;

import com.example.a86066.appmvptaskap03.bean.LoginBean;
import com.example.a86066.appmvptaskap03.dase.BaseCallback;

public interface LoginCallback extends BaseCallback<LoginBean,String> {
    @Override
    void onSuucess(LoginBean loginBean);

    @Override
    void onFail(String s);
}
