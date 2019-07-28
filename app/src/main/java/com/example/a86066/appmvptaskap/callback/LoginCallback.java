package com.example.a86066.appmvptaskap.callback;

import com.example.a86066.appmvptaskap.bean.LoginBean;

public interface LoginCallback {
    void onSuucess(LoginBean loginBean);

    void onFail(String errror);
}
