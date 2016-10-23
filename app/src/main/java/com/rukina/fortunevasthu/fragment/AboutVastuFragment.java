package com.rukina.fortunevasthu.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rukina.fortunevasthu.R;
import android.support.v4.app.Fragment;

/**
 * Created by Nandha on 22-10-2016.
 */

public class AboutVastuFragment extends Fragment {

    public AboutVastuFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_about_vastu, container, false);
        return rootView;
    }
}
