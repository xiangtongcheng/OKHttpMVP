package com.cxt.okhttpmvp.simple2;

//P层
//特点
//特点一：持有M层的引用
//特点二：持有V层的引用
//特点三：对M层和V层惊喜关联

import com.cxt.okhttpmvp.UserData;
import com.cxt.okhttpmvp.simple1.LoginView;

public class LoginPresenter_2 {

    private LoginModel_2 loginModel;
    private LoginView_2 loginView;

    public LoginPresenter_2() {
        this.loginModel = new LoginModel_2();
    }

    public void attachView(LoginView_2 loginView) {
        this.loginView = loginView;
    }

    public void detachView() {
        this.loginView = null;
    }

    public void login(String username, String password) {
        loginModel.login(username, password, new UserData() {
            @Override
            public void setData(String data) {
                if (loginView != null) {
                    loginView.LoginResult(data);
                }

            }
        });
    }


}
