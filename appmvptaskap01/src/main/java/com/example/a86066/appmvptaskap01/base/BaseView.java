package com.example.a86066.appmvptaskap01.base;

public interface BaseView<T,K> {
    void onSuucess(T t);

    void onFail(K k);
}
