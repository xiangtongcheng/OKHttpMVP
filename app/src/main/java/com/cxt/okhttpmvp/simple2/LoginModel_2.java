package com.cxt.okhttpmvp.simple2;

import com.cxt.okhttpmvp.UserData;

public class LoginModel_2 {
    public void login(String username, String password, UserData userData) {
        userData.setData("....有数据了" + "username==" + username + "password=" + password);
    }
}
