package com.example.dianshang;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private NavigationView na;
    private ViewPager main_vp;
    private TabLayout main_tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        Handler handler = new Handler();
        Message message = handler.obtainMessage();
        message.obj="123";
        message.what=0x001;
        handler.sendMessage(message);
    }

    private void initView() {
        na = (NavigationView) findViewById(R.id.na);
        main_vp = (ViewPager) findViewById(R.id.main_vp);
        main_tab = (TabLayout) findViewById(R.id.main_tab);
    }
}
