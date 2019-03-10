package com.cxt.okhttpmvp.simple4;

//P层
//特点
//特点一：持有M层的引用
//特点二：持有V层的引用
//特点三：对M层和V层惊喜关联

import com.cxt.okhttpmvp.UserData;
import com.cxt.okhttpmvp.simple3.LoginModel_3;
import com.cxt.okhttpmvp.simple3.base.BasePresenter_3;
import com.cxt.okhttpmvp.simple4.base.BasePresenter_4;
import com.cxt.okhttpmvp.simple4.base.BaseView_4;

public class LoginPresenter_4 extends BasePresenter_4<LoginView_4> {

    private LoginModel_4 loginModel;

    public LoginPresenter_4() {
        this.loginModel = new LoginModel_4();
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
