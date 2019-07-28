package com.example.a86066.appmvptaskap.base;

public interface BaseView<T,K> {
    void onSuucess(T t);

    void onFail(K k);
}
