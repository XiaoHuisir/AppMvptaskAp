package com.example.a86066.appmvptask02.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<P extends  BasePresenter,M extends  BaseModel ,V extends  BaseView>  extends AppCompatActivity {
   private  P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());

        presenter=initMvpPresenter();
        if (presenter!=null){
            presenter.setModel(initMvpModel());
            presenter.setView(initView());
        }


        initdata();

    }

    protected abstract V initView();

    protected abstract M initMvpModel();

    protected abstract P initMvpPresenter();

    protected abstract void initdata();


    protected abstract int setLayoutId();
}
