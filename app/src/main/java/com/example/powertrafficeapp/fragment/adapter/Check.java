package com.example.powertrafficeapp.fragment.adapter;

import android.widget.CompoundButton;

/**
 * Created by dell on 2017/08/29.
 */

public abstract class Check implements CompoundButton.OnCheckedChangeListener {

    public abstract void listViewIddddtemClick(int position, boolean b);

    //    @Override
//    public void onClick(View v){
//
//        listViewIddddtemClick((Integer)v.getTag(),v);
//    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {
        // TODO Auto-generated method stub

        listViewIddddtemClick((Integer) buttonView.getTag(), isChecked);


    }
}
