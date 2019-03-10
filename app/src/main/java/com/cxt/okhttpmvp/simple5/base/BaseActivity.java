package com.cxt.okhttpmvp.simple5.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//抽象->抽象出解绑和绑定操作
//注意：为了能够兼容读个模块，兼容多个Activity,所以我们采用泛型设计
public abstract class BaseActivity<V extends BaseView_5, P extends BasePresenter_5<V>> extends AppCompatActivity {

    private P presenter;
    private V view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.presenter == null) {
            this.presenter = createPresenter();
        }
        if (this.view == null) {
            this.view = createView();
        }
        if (this.presenter != null && this.view != null) {
            this.presenter.attachView(view);
        }
    }

    public P getPresenter() {
        return presenter;
    }

    public abstract P createPresenter();

    public abstract V createView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.presenter != null && this.view != null) {
            this.presenter.detachView();
        }
    }
}
