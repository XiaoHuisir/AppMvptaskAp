package com.example.a86066.appmvptaskap.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
                            //LoginPresenter
public abstract class BaseActivity<p extends BasePresenter,M extends BaseModel,V extends BaseView> extends AppCompatActivity {
    /*
     *  <p extends  BasePresenter>  //有界泛型
     * */

    public p presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        presenter = initMvpPresenter();

        if (presenter != null) {
            presenter.setModel(initMvpModel());
            presenter.setView(initMvpview());
        }
        initMvp();

        initView();

        initData();

        initListener();
    }

    protected abstract V initMvpview();

    protected abstract M initMvpModel();

    protected abstract p initMvpPresenter();


    protected void initMvp() {
    }

    protected void initData() {
    }

    protected void initView() {
    }

    protected void initListener() {
    }


    protected abstract int getLayoutId();


    protected void toast(String msg) {
        Toast.makeText(BaseActivity.this, msg, Toast.LENGTH_SHORT).show();
    }


}
