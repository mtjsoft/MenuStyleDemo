package com.huahan.www.menustyledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView style1TextView;
    private TextView style2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        style1TextView = (TextView) findViewById(R.id.tv_style_1);
        style2TextView = (TextView) findViewById(R.id.tv_style_2);
        style1TextView.setOnClickListener(this);
        style2TextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.tv_style_1:
                intent = new Intent(this, SliDingPaneLayoutActivity.class);
                break;
            case R.id.tv_style_2:
                intent = new Intent(this, DrawerLayoutActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
