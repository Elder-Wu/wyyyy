package com.wuzhanglao.wyyyy.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.wuzhanglao.wyyyy.R;

/**
 * Created by wuming on 16/10/14.
 */

public abstract class ToolbarActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        beforeSetContentView();
        setContentView(setContentView());
        afterSetContentView();
        initDefaultToolBar();
        initView();
    }

    private void initDefaultToolBar() {
        toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
    }

    public Toolbar getDefaultToolbar(){
        return toolbar;
    }
}
