package com.example.administrator.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        设置app  logo
        toolbar.setLogo(R.mipmap.ic_launcher);
//        设置主标题
        toolbar.setTitle("Title");
        toolbar.setTitleTextColor(getResources().getColor(R.color.color_red));
//        设置子标题
        toolbar.setSubtitle("Subtitle");
        setSupportActionBar(toolbar);
//          设置右上角的填充菜单
        toolbar.inflateMenu(R.menu.base_toolbar_menu);
//        设置导航栏图标
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
//        设置填充菜单的点击事件
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
//                获取item的id,根据id判断点击的item
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(MainActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();
                } else if (menuItemId == R.id.action_notification) {
                    Toast.makeText(MainActivity.this, R.string.menu_notification, Toast.LENGTH_SHORT).show();
                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(MainActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();
                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(MainActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

    }
}
