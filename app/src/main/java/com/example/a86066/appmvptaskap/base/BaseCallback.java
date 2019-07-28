package com.example.a86066.appmvptaskap.base;

import com.example.a86066.appmvptaskap.bean.LoginBean;

public interface BaseCallback<T,K> {

    void onSuucess(T t);

    void onFail(K k);
}
