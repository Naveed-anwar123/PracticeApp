package com.example.naveed.practiceapp.Likes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.utils.BottomNavigationBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Naveed on 13/08/2017.
 */
public class LikeActivity extends AppCompatActivity{

    private static final String TAG = "LikeActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationBarSettup();
        Log.d(TAG, "onCreate: Started");
    }

    private void NavigationBarSettup()
    {
        BottomNavigationViewEx btex = (BottomNavigationViewEx)findViewById(R.id.bottom);
        BottomNavigationBarHelper.setup(btex);
        btex.setItemIconTintList(null); // to show original icons
        BottomNavigationBarHelper.enableNavigation(LikeActivity.this ,btex);
        Menu menu = btex.getMenu();
        MenuItem item = menu.getItem(3);
        item.setChecked(true);
    }
}
