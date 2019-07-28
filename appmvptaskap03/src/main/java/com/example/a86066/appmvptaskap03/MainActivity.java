package com.example.a86066.appmvptaskap03;


import android.widget.Toast;

import com.example.a86066.appmvptaskap03.bean.LoginBean;
import com.example.a86066.appmvptaskap03.dase.BaseActivity;
import com.example.a86066.appmvptaskap03.model.LoginModel;
import com.example.a86066.appmvptaskap03.presenter.LoginPresenter;
import com.example.a86066.appmvptaskap03.view.LoginView;

public class MainActivity extends BaseActivity<LoginPresenter,LoginModel,LoginView> implements LoginView {


    @Override
    protected LoginView initMvpVeiw() {
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
//         presenter.login();

    }


    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }


    /*
     * loginView
     *
     * */
    @Override
    public void seccsec(LoginBean loginBean) {

    }

    @Override
    public void error(String s) {
        Toast.makeText(this, "请求失败", Toast.LENGTH_SHORT).show();
    }
}
