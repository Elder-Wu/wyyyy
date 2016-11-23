package com.wuzhanglao.wyyyy.activity;

import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;

import com.wuzhanglao.wyyyy.R;

public class MainActivity extends ToolbarActivity {

    @Override
    protected void doOnNext(Object o) {

    }

    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterSetContentView() {
        super.afterSetContentView();
        initDefaultToolBar();
        getDefaultToolbar().setTitle("网易云音乐");
        getDefaultToolbar().setTitleTextColor(Color.WHITE);
        getDefaultToolbar().setBackgroundColor(Color.RED);
        getDefaultToolbarRoot().setBackgroundColor(Color.RED);
    }

    @Override
    protected void initView() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, getDefaultToolbar(), R.string.open_string, R.string.close_string);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
    }
}
