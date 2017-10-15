package com.example.powertrafficeapp.fragment.carinfor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.powertrafficeapp.R;
import com.example.powertrafficeapp.util.Carinformation;
import com.example.powertrafficeapp.util.DBAdapter;

/**
 * Created by dell on 2017/08/01.
 */

public class Carinfor_2 extends Fragment {
    DBAdapter adpter;
    private TextView textViewname;
    private TextView text_name;
    private TextView text_chongzhijilu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.carinfor_2, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        textViewname = (TextView) getActivity().findViewById(R.id.tv_c2_name);
        text_name = (TextView) getActivity().findViewById(R.id.textView_car_name);
        text_chongzhijilu = (TextView) getActivity().findViewById(R.id.text_F8_c2_chongzhi);
        textViewname.setText(text_name.getText().toString());
        adpter = new DBAdapter(getActivity());
        adpter.openDB();
        String input = text_name.getText().toString();
        Carinformation[] peoples = adpter.queryByName(input);
        if (peoples == null) {
            text_chongzhijilu.setText("对不起，没有充值信息");

        } else {
            String result = "";
            for (int i = 0; i < peoples.length; i++) {
                result = result + peoples[i].showInfo();
            }
            text_chongzhijilu.setText(result);
        }
        super.onActivityCreated(savedInstanceState);
    }
}
