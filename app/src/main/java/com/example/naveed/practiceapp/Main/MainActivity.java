package com.example.naveed.practiceapp.Main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.utils.BottomNavigationBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivityUpdated";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");
        NavigationBarSettup();
        ViewPagerSetup();
    }

    public void ViewPagerSetup()
    {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addToList(new CameraFragment());
        adapter.addToList(new MainFragment());
        adapter.addToList(new MessagesFragment());
        ViewPager vp = (ViewPager)findViewById(R.id.vpid);
        vp.setAdapter(adapter);
        TabLayout toptabs = (TabLayout)findViewById(R.id.tabs);
        toptabs.setupWithViewPager(vp);
        toptabs.getTabAt(0).setIcon(R.drawable.ic_camera);
        toptabs.getTabAt(1).setIcon(R.drawable.ic_home);
        toptabs.getTabAt(2).setIcon(R.drawable.ic_arrow);



    }
    private void NavigationBarSettup()
    {
        BottomNavigationViewEx btex = (BottomNavigationViewEx)findViewById(R.id.bottom);
        BottomNavigationBarHelper.setup(btex);
        btex.setItemIconTintList(null); // to show original icons
        BottomNavigationBarHelper.enableNavigation(MainActivity.this ,btex);
        Menu menu = btex.getMenu();
        MenuItem item = menu.getItem(0);
        item.setChecked(true);

    }
}
