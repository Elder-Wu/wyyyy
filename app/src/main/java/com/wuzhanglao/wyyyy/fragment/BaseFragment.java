package com.wuzhanglao.wyyyy.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by wuming on 16/10/14.
 */

public abstract class BaseFragment extends Fragment {

    public Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = this.getContext();
        return inflater.inflate(setResId(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.e("MainActivity", "BaseFragment onViewCreated");
        //解决Fragment覆盖的时候会点到其他Fragment的问题
        view.setClickable(true);
        //给Fragment统一设置一个默认的背景，这样就不会透明了
        view.setBackgroundColor(Color.WHITE);
        initView(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart(getClass().getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd(getClass().getSimpleName());
    }

    public abstract int setResId();

    public abstract void initView(View view, @Nullable Bundle savedInstanceState);

}
