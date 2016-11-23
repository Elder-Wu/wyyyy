package com.wuzhanglao.wyyyy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.wuzhanglao.wyyyy.R;
import com.wuzhanglao.wyyyy.mvp.presenter.NavigationFragmentPresenter;
import com.wuzhanglao.wyyyy.mvp.view.NavigationFragmentMvpView;

/**
 * Created by wuming on 2016/11/23.
 */

public class NavigationFragment extends BaseMvpFragment<NavigationFragmentMvpView, NavigationFragmentPresenter>
        implements NavigationFragmentMvpView {
    @Override
    public int setResId() {
        return R.layout.fragment_navigation;
    }

    @Override
    public void initView(View view, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public NavigationFragmentPresenter initPresenter() {
        return new NavigationFragmentPresenter();
    }
}
