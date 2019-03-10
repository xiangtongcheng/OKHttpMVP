package com.cxt.okhttpmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cxt.okhttpmvp.simple1.LoginModel;
import com.cxt.okhttpmvp.simple1.LoginPresenter;
import com.cxt.okhttpmvp.simple1.LoginView;
import com.cxt.okhttpmvp.simple2.LoginPresenter_2;
import com.cxt.okhttpmvp.simple2.LoginView_2;
import com.cxt.okhttpmvp.simple3.LoginPresenter_3;
import com.cxt.okhttpmvp.simple3.LoginView_3;
import com.cxt.okhttpmvp.simple4.LoginPresenter_4;
import com.cxt.okhttpmvp.simple4.LoginView_4;
import com.cxt.okhttpmvp.simple5.LoginPresenter_5;
import com.cxt.okhttpmvp.simple5.LoginView_5;
import com.cxt.okhttpmvp.simple5.base.BaseActivity;
import com.cxt.okhttpmvp.simple5.base.BasePresenter_5;
import com.cxt.okhttpmvp.simple5.base.BaseView_5;

public class MainActivity extends BaseActivity<LoginView_5, LoginPresenter_5> implements LoginView_5 {

    private TextView textView;

    private LoginPresenter_4 loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);

    }

    @Override
    public LoginPresenter_5 createPresenter() {
        return new LoginPresenter_5();
    }

    @Override
    public LoginView_5 createView() {
        return this;
    }


    //第一步
    //MVP设计关键
    //M层：LoginModel->专门负责数据层->数据库操作、网络操作、文件操作等等。。。。
    //V层：LoginPresenter->专门负责交互（中介）—> 将UI层和数据层进行关联
    //P层：LoginView->进行UI交互回调
    //    public void btn(View view) {
    //        LoginPresenter loginPresenter = new LoginPresenter(this);
    //        loginPresenter.login("123456", "123456");
    //    }


    //第二步
    //发现问题：当我们的网络请求正在进行，这个时候我们退出了Activity,然后UI层引用还在，
    //还会回调,其实没有必要了，我们可以直接退出终止请求，当前代码存在隐患？
    //解决方案：方法 ->绑定和解绑
//    public void btn(View view) {
//        loginPresenter = new LoginPresenter_2();
//        loginPresenter.attachView(this);
//        loginPresenter.login("123456", "123456");
//    }


    //第三步
    //发现问题：一个类，如果多个类，那么就会出现反复绑定和解绑
    //解决方案：方法 ->将绑定和解绑进行抽象->BasePresenter_3
//    public void btn(View view) {
//        loginPresenter = new LoginPresenter_3();
//        loginPresenter.attachView(this);
//        loginPresenter.login("333333", "123456");
//    }


    //第四步
    //发现问题：抽象父类，类型写死了
    //解决方案：泛型设计或强制类型转换
//    public void btn(View view) {
//        loginPresenter = new LoginPresenter_4();
//        loginPresenter.attachView(this);
//        loginPresenter.login("44444", "123456");
//    }


    //第五步
    //发现问题：随着我们的Activity,Fragment的数量增加，你会发现我们需要反复的绑定和解绑，这个操作属于代码冗余
    //解决方案：Activity抽象+泛型设计
    public void btn(View view) {
        getPresenter().login("555555", "123456");
    }


    @Override
    public void LoginResult(String result) {
        textView.setText(result);
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (loginPresenter != null) {
//            loginPresenter.detachView();
//        }
//    }
}
