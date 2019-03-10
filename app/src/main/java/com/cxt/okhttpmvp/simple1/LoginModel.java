package com.cxt.okhttpmvp.simple1;

import com.cxt.okhttpmvp.UserData;

public class LoginModel {
    public void login(String username, String password, UserData userData) {
        userData.setData("....有数据了" + "username==" + username + "password=" + password);
    }
}
