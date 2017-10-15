package com.example.powertrafficeapp.fragment.carinfor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.powertrafficeapp.R;

/**
 * Created by dell on 2017/08/01.
 */

public class Carinfor_1 extends Fragment {
    private TextView textViewcarinforname;
    private TextView text_name;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.carinfor_1, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        textViewcarinforname = (TextView) getActivity().findViewById(R.id.textView_carinfor_name);
        text_name = (TextView) getActivity().findViewById(R.id.textView_car_name);
        textViewcarinforname.setText(text_name.getText().toString());

        super.onActivityCreated(savedInstanceState);
    }


}
