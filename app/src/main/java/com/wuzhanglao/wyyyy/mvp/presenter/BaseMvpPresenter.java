package com.wuzhanglao.wyyyy.mvp.presenter;

import com.wuzhanglao.wyyyy.mvp.view.BaseMvpView;

/**
 * Created by wuming on 2016/11/23.
 */

public class BaseMvpPresenter<V extends BaseMvpView> {
    private V view;

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        view = null;
    }
}
