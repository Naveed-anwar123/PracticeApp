package com.example.naveed.practiceapp.Main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naveed.practiceapp.R;

/**
 * Created by Naveed on 13/08/2017.
 */
public class CameraFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =inflater.inflate(R.layout.fragment_camera,container , false);
        return view;

    }
}
