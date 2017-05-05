package com.huahan.www.menustyledemo;

import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by android.mtj on 2017/5/5.
 */

public class SliDingPaneLayoutActivity extends AppCompatActivity {
    private SlidingPaneLayout slidingPaneLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slidingpanelayout);
        slidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.slidingpande);

//        SlidingPaneLayout  一些主要方法：
//
//        setParallaxDistance(int parallaxBy) 设置滑动视差
//
//        setCoveredFadeColor(int color) 导航菜单视图的滑动颜色渐变
//
//        setSliderFadeColor(int color) 主视图的滑动颜色渐变
//
//        setPanelSlideListener(SlidingPaneLayout.PanelSlideListener listener) 滑动监听
//
//        openPane() 打开导航菜单
//
//        closePane() 关闭导航菜单


        slidingPaneLayout.setSliderFadeColor(0);
        //可选
        slidingPaneLayout.setParallaxDistance(200);
        //可选
        slidingPaneLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
            }

            @Override
            public void onPanelOpened(View panel) {
            }

            @Override
            public void onPanelClosed(View panel) {
            }
        });
    }
}
