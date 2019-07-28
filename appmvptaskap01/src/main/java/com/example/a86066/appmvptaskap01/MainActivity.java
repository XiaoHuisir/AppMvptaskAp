package com.example.a86066.appmvptaskap01;


import android.widget.Button;
import android.widget.EditText;

import com.example.a86066.appmvptaskap01.base.BaseAcvitity;
import com.example.a86066.appmvptaskap01.model.LoginModel;
import com.example.a86066.appmvptaskap01.presenter.LoginPresenter;
import com.example.a86066.appmvptaskap01.view.LoginView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseAcvitity<LoginPresenter,LoginModel,LoginView> {

    @BindView(R.id.edusername)
    EditText edusername;
    @BindView(R.id.edupwd)
    EditText edupwd;
    @BindView(R.id.butlogin)
    Button butlogin;



    @OnClick(R.id.butlogin)
    public void onClick() {

    }

    @Override
    protected LoginView initMvpView() {
        return null;
    }

    @Override
    protected LoginModel initMvpModel() {
        return null;
    }

    @Override
    protected LoginPresenter initMvpPresenter() {
        return null;
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }
}
