package com.huahan.www.menustyledemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by android.mtj on 2017/5/5.
 */

public class DrawerLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout);

//        DrawerLayout 的一些主要方法：
//
//        addDrawerListener(DrawerLayout.DrawerListener listener) 添加滑动监听
//
//        openDrawer(int gravity) 开启导航菜单 参数：GravityCompat.START GravityCompat.END 要跟 XML 设置相同
//
//        closeDrawer(int gravity) 关闭导航菜单
//
//        isDrawerOpen(int drawerGravity) 菜单是否开启

    }
}
