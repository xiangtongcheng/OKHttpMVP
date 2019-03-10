package com.cxt.okhttpmvp.simple1;

//P层
//特点
//特点一：持有M层的引用
//特点二：持有V层的引用
//特点三：对M层和V层惊喜关联

import com.cxt.okhttpmvp.UserData;

public class LoginPresenter {

    private LoginModel loginModel;
    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModel();
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
