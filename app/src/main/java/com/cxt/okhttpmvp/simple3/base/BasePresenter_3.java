package com.cxt.okhttpmvp.simple3.base;

import com.cxt.okhttpmvp.simple3.LoginView_3;

public abstract class BasePresenter_3 {

    private LoginView_3 loginView;

    public LoginView_3 getLoginView() {
        return loginView;
    }

    public void attachView(LoginView_3 loginView) {
        this.loginView = loginView;
    }

    public void detachView() {
        this.loginView = null;
    }
}
