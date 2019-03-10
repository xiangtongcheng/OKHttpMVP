package com.cxt.okhttpmvp.simple5;

import com.cxt.okhttpmvp.UserData;

public class LoginModel_5 {
    public void login(String username, String password, UserData userData) {
        userData.setData("....有数据了" + "username==" + username + "password=" + password);
    }
}
