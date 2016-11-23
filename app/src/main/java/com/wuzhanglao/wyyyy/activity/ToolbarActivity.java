package com.wuzhanglao.wyyyy.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.wuzhanglao.wyyyy.R;

/**
 * Created by wuming on 16/10/14.
 */

public abstract class ToolbarActivity extends BaseActivity {

    private View toolbarRootView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void initDefaultToolBar() {
        toolbarRootView = findViewById(R.id.activity_main_toolbar);
        toolbar = (Toolbar) toolbarRootView.findViewById(R.id.toolbar_general);
    }

    public Toolbar getDefaultToolbar() {
        return toolbar;
    }

    public View getDefaultToolbarRoot() {
        return toolbarRootView;
    }
}
