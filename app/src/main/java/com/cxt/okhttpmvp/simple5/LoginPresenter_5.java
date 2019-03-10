package com.cxt.okhttpmvp.simple5;

//P层
//特点
//特点一：持有M层的引用
//特点二：持有V层的引用
//特点三：对M层和V层惊喜关联

import com.cxt.okhttpmvp.UserData;
import com.cxt.okhttpmvp.simple4.LoginModel_4;
import com.cxt.okhttpmvp.simple4.LoginView_4;
import com.cxt.okhttpmvp.simple4.base.BasePresenter_4;
import com.cxt.okhttpmvp.simple5.base.BasePresenter_5;

public class LoginPresenter_5 extends BasePresenter_5<LoginView_5> {

    private LoginModel_5 loginModel;

    public LoginPresenter_5() {
        this.loginModel = new LoginModel_5();
    }



    public void login(String username, String password) {
        loginModel.login(username, password, new UserData() {
            @Override
            public void setData(String data) {
                if (getView() != null) {
                    getView().LoginResult(data);
                }
            }
        });
    }


}
