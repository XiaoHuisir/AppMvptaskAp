package com.example.a86066.appmvptaskap03.dase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel, V extends BaseView> extends AppCompatActivity {

    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        presenter = initMvpPresenter();

        if (presenter!=null){
            presenter.setModel(initMvpModel());
            presenter.setView(initMvpVeiw());
        }

        initdata();

    }

    protected abstract V initMvpVeiw();

    protected abstract M initMvpModel();

    protected abstract P initMvpPresenter();


    protected abstract void initdata();


    protected abstract int setLayoutId();
}
