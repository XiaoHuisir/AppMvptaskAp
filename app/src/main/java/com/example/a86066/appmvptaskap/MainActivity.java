package com.example.a86066.appmvptaskap;


import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a86066.appmvptaskap.base.BaseActivity;

import com.example.a86066.appmvptaskap.bean.LoginBean;
import com.example.a86066.appmvptaskap.model.LoginModel;
import com.example.a86066.appmvptaskap.presenter.LoginPresenter;
import com.example.a86066.appmvptaskap.view.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<LoginPresenter,LoginModel,LoginView> implements LoginView {

    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;



    /*
     * BaseActivity
     *   强制写的
     * */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick(R.id.btn_login)
    public void onClick() {
        submit();
    }

    private void submit() {

        String name = etName.getText().toString().trim();
        String pwd = etPwd.getText().toString().trim();


        if (presenter != null) {
            presenter.login(name, pwd);
        }
    }

    @Override
    public void onSuucess(LoginBean loginBean) {
        Toast.makeText(this, loginBean.getRet(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFail(String errror) {
        Toast.makeText(this, errror, Toast.LENGTH_SHORT).show();

    }

//----------------------------------------
    @Override
    protected LoginView initMvpview() {
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
//---------------------------------------

}
