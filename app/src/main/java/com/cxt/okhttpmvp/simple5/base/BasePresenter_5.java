package com.cxt.okhttpmvp.simple5.base;

import com.cxt.okhttpmvp.simple4.base.BaseView_4;

public abstract class BasePresenter_5<V extends BaseView_5> {

    private V view;

    public V getView() {
        return view;
    }

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        this.view = null;
    }
}
