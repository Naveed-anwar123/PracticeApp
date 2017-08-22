package com.example.naveed.practiceapp.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.naveed.practiceapp.R;
import com.example.naveed.practiceapp.utils.UniversalImageLoader;

/**
 * Created by Naveed on 15/08/2017.
 */

public class EdtiProfileFragment extends Fragment {
    private static final String TAG = "EditProfileFragment";

    private ImageView mProfilePhoto;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_edit_profile,container , false);
        mProfilePhoto = (ImageView) view.findViewById(R.id.profile_photo);

        //setProfileImage();

        return view;

    }


    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image.");
        String imgURL = "http://lorempixel.com/400/200/";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto, null, "https://");
    }
}
