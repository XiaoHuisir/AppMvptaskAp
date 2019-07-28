package com.example.a86066.appmvptaskap.presenter;

import android.text.TextUtils;
import android.widget.Toast;

import com.example.a86066.appmvptaskap.base.BasePresenter;
import com.example.a86066.appmvptaskap.bean.LoginBean;
import com.example.a86066.appmvptaskap.callback.LoginCallback;
import com.example.a86066.appmvptaskap.model.LoginModel;
import com.example.a86066.appmvptaskap.view.LoginView;

public class LoginPresenter extends BasePresenter<LoginModel,LoginView> implements LoginCallback {



    public  void   login(String name, String pwd){
        if (TextUtils.isEmpty(name)) {
           if (view!=null){
               view.onFail("name不能为空");
           }
         return;
        }
        if (TextUtils.isEmpty(pwd)) {
            if (view!=null){
                view.onFail("pwd不能为空");
            }
            return;
        }
    if (model!=null){
        model.login(name,pwd,this);

    }
}

    @Override
    public void onSuucess(LoginBean loginBean) {
        if (view!=null){
            view.onSuucess(loginBean);
        }
    }

    @Override
    public void onFail(String errror) {
     if (view!=null){
         view.onFail(errror);
     }
    }
}
