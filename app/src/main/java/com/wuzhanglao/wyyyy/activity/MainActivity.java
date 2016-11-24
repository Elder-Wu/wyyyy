package com.wuzhanglao.wyyyy.activity;

import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;

import com.wuzhanglao.wyyyy.R;

public class MainActivity extends ToolbarActivity {

    //在这里可以处理广播
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
        getDefaultToolbar().setBackgroundColor(Color.RED);
        getDefaultToolbarRoot().setBackgroundColor(Color.RED);

        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawer);
        final ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, getDefaultToolbar(), R.string.open_string, R.string.close_string);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
    }

    @Override
    protected void initView() {

    }
}
