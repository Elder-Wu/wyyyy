package com.wuzhanglao.wyyyy.activity;

import android.graphics.Color;

import com.wuzhanglao.wyyyy.R;

public class MainActivity extends ToolbarActivity {

    @Override
    protected int setSystemBarColor() {
        return Color.parseColor("#FFFFFF");
    }

    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        getDefaultToolbar().setTitle("网易云音乐");
        getDefaultToolbar().setNavigationIcon(R.drawable.back);
        getDefaultToolbar().setBackgroundColor(Color.RED);
    }
}
