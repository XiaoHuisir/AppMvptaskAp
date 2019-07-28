package com.example.a86066.appmvptask02;

import com.example.a86066.appmvptask02.base.BaseActivity;
import com.example.a86066.appmvptask02.bean.LoginBean;
import com.example.a86066.appmvptask02.model.LoginModel;
import com.example.a86066.appmvptask02.presenter.LoginPresenter;
import com.example.a86066.appmvptask02.view.LoginView;

public class MainActivity extends BaseActivity<LoginPresenter,LoginModel,LoginView> implements  LoginView {


    @Override
    protected LoginView initView() {
        return this;
    }

    @Override
    protected LoginModel initMvpModel() {
        return new LoginModel();
    }

    @Override
    protected LoginPresenter initMvpPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void seccsec(LoginBean loginBean) {

    }

    @Override
    public void inEnit(String s) {

    }
}
