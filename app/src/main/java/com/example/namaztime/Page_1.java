package com.example.namaztime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Captain Code on 13/09/2017.
 */

public class Page_1 extends Fragment {

    //Constructor default
    public Page_1(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.page1, container, false);


        return PageOne;
    }
}
