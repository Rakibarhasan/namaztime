package com.example.namaztime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Captain Code on 13/09/2017.
 */

public class Page_3  extends Fragment {

    //Constructor default
    public Page_3(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTree = inflater.inflate(R.layout.page3, container, false);



        return PageTree;
    }
}