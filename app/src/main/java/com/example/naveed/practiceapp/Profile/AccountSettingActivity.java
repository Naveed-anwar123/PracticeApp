package com.example.naveed.practiceapp.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.utils.BottomNavigationBarHelper;
import com.example.naveed.practiceapp.utils.SectionPagerAdapterForFragment;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveed on 14/08/2017.
 */

public class AccountSettingActivity extends AppCompatActivity {

    private SectionPagerAdapterForFragment fragmentAdapter ;
    private ViewPager vp;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsetting);
        vp = (ViewPager) findViewById(R.id.vpid);
        relativeLayout = (RelativeLayout)findViewById(R.id.relative);
        NavigationBarSettup();

        setupListView();
        setupFragmentStateAdapter();
        ImageButton img = (ImageButton)findViewById(R.id.arrow);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AccountSettingActivity.this ,ProfileActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void NavigationBarSettup()
    {
        BottomNavigationViewEx btex = (BottomNavigationViewEx)findViewById(R.id.bottom);
        BottomNavigationBarHelper.setup(btex);
        btex.setItemIconTintList(null); // to show original icons
        BottomNavigationBarHelper.enableNavigation(AccountSettingActivity.this ,btex);
        Menu menu = btex.getMenu();
        MenuItem item = menu.getItem(4);
        item.setChecked(true);

    }

    private void setupListView()
    {
        ListView listView = (ListView) findViewById(R.id.lvaccountsetting);
        ArrayList<String> alist = new ArrayList<>();
        alist.add(getString(R.string.edit_name));
        alist.add(getString(R.string.sign_out));
        ArrayAdapter adapter = new ArrayAdapter(this ,R.layout.support_simple_spinner_dropdown_item,alist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                setViewPager(i);
                Toast.makeText(getBaseContext(),""+i,Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setupFragmentStateAdapter(){
        Toast.makeText(getBaseContext(),"fragment pager adapter",Toast.LENGTH_LONG).show();
        fragmentAdapter = new SectionPagerAdapterForFragment(getSupportFragmentManager());
        fragmentAdapter.addFragment(new EdtiProfileFragment() , getString(R.string.edit_name));
        fragmentAdapter.addFragment(new SingOutFragment() , getString(R.string.sign_out));

    }

    public void setViewPager(int fragment)
    {
      relativeLayout.setVisibility(View.GONE);
        vp.setAdapter(fragmentAdapter);
        vp.setCurrentItem(fragment);
    }

}
