package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Colle on 4/10/2017.
 */

public class LoggedInFragment extends Fragment {


    private static TextView login_frag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){


        View view = inflater.inflate(R.layout.login_fragment, container, false);

        login_frag = (TextView) view.findViewById(R.id.fragment3);


        return view;

    }



}
