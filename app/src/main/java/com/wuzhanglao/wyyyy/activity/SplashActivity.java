package com.wuzhanglao.wyyyy.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;

import com.wuzhanglao.wyyyy.R;


/**
 * Created by wuming on 2016/11/21.
 */

public class SplashActivity extends FullScreenActivity {

    private final Handler handler = new Handler();

    @Override
    protected int setSystemBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return getResources().getColor(R.color.transparent, null);
        } else {
            return getResources().getColor(R.color.transparent);
        }
    }

    @Override
    protected int setContentView() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}
