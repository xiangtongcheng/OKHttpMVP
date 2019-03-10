package com.cxt.okhttpmvp.simple4.base;

public abstract class BasePresenter_4<V extends BaseView_4> {

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
