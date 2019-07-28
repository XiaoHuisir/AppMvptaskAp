package com.example.a86066.appmvptaskap01.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import butterknife.ButterKnife;

public  abstract class BaseAcvitity<P extends  BasePresenter ,M extends  BaseModel,V extends  BaseView>  extends  AppCompatActivity {

    public  P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        ButterKnife.bind(this);
        presenter=initMvpPresenter();
        if (presenter!=null){
            presenter.setModel(initMvpModel());
            presenter.setView(initMvpView());
        }

        initView();
        initdata();

    }

    protected abstract V initMvpView();

    protected abstract M initMvpModel();

    protected abstract P initMvpPresenter();

    protected abstract void initdata();

    protected abstract void initView();

    protected abstract int setLayoutId();
}
