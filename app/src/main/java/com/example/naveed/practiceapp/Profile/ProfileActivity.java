package com.example.naveed.practiceapp.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.utils.BottomNavigationBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Naveed on 13/08/2017.
 */
public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "Profile";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_profile);
       // NavigationBarSettup();
        Log.d(TAG, "onCreate: Started");
        setupTopToolbar();
    }


    public void setupTopToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolbar);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.profileMenu:
                        Toast.makeText(getBaseContext() , "clicked",Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });
    }

    private void NavigationBarSettup()
    {
        BottomNavigationViewEx btex = (BottomNavigationViewEx)findViewById(R.id.bottom);
        BottomNavigationBarHelper.setup(btex);
        btex.setItemIconTintList(null); // to show original icons
        BottomNavigationBarHelper.enableNavigation(ProfileActivity.this ,btex);
        Menu menu = btex.getMenu();
        MenuItem item = menu.getItem(4);
        item.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu,menu);
        return true;

    }
}
