package com.example.naveed.practiceapp.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.naveed.practiceapp.Likes.LikeActivity;
import com.example.naveed.practiceapp.Main.MainActivity;
import com.example.naveed.practiceapp.Profile.ProfileActivity;
import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.Search.SearchActivity;
import com.example.naveed.practiceapp.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Naveed on 13/08/2017.
 */
public class BottomNavigationBarHelper {
    private static final String TAG = "BottomNavigationBarHelper";

    public static void setup(BottomNavigationViewEx b)
    {
        b.enableAnimation(false);
        b.enableShiftingMode(false);
        b.enableItemShiftingMode(false);
        b.setTextVisibility(false);
    }


    public static void enableNavigation(final Context context , BottomNavigationView view)
    {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent i1 = new Intent(context , MainActivity.class);
                        context.startActivity(i1);
                        break;
                    case R.id.ic_search:
                        Intent i2 = new Intent(context , SearchActivity.class);
                        context.startActivity(i2);
                        break;
                    case R.id.ic_share:
                        Intent i3 = new Intent(context , ShareActivity.class);
                        context.startActivity(i3);
                        break;
                    case R.id.ic_like:
                        Intent i4 = new Intent(context , LikeActivity.class);
                        context.startActivity(i4);
                        break;
                    case R.id.ic_profile:
                        Intent i5 = new Intent(context , ProfileActivity.class);
                        context.startActivity(i5);
                        break;
                }

                return false;
            }
        });
    }



}
