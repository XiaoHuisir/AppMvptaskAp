package com.example.a86066.appmvptaskap03.dase;

public interface BaseCallback<T ,K> {
    void onSuucess(T t);

    void onFail(K k);
}
