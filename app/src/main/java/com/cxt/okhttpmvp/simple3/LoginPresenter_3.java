package com.cxt.okhttpmvp.simple3;

//P层
//特点
//特点一：持有M层的引用
//特点二：持有V层的引用
//特点三：对M层和V层惊喜关联

import com.cxt.okhttpmvp.UserData;
import com.cxt.okhttpmvp.simple2.LoginModel_2;
import com.cxt.okhttpmvp.simple2.LoginView_2;
import com.cxt.okhttpmvp.simple3.base.BasePresenter_3;

public class LoginPresenter_3 extends BasePresenter_3 {

    private LoginModel_3 loginModel;

    public LoginPresenter_3() {
        this.loginModel = new LoginModel_3();
    }



    public void login(String username, String password) {
        loginModel.login(username, password, new UserData() {
            @Override
            public void setData(String data) {
                if (getLoginView() != null) {
                    getLoginView().LoginResult(data);
                }
            }
        });
    }


}
