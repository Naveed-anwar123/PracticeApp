package com.example.naveed.practiceapp.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.naveed.practiceapp.Login.LoginActivity;
import com.example.naveed.practiceapp.R;

/**
 * Created by Naveed on 13/08/2017.
 */
public class CameraFragment extends Fragment {
    private Button login;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =inflater.inflate(R.layout.fragment_camera,container , false);
        login = (Button) view.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext() ,LoginActivity.class);
                startActivity(i);


            }

            ;
        });

        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
