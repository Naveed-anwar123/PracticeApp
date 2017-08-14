package com.example.naveed.practiceapp.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.utils.BottomNavigationBarHelper;
import com.example.naveed.practiceapp.utils.SectionPagerAdapterForFragment;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Naveed on 13/08/2017.
 */
public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "Profile";

    private ProgressBar progressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_profile);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);

        progressBar.setVisibility(View.GONE);
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
                        Intent i = new Intent(ProfileActivity.this , AccountSettingActivity.class);
                        startActivity(i);
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
