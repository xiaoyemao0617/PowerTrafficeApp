package com.example.powertrafficeapp.fragment.Chart_Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.powertrafficeapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.Random;


/**
 * Created by dell on 2017/08/01.
 */

public class Chart_Fragment_4 extends Fragment {
    private BarChart chart;
    private LineChart lineChart;

    private Random random;

    private BarData data;
    private LineData data1;
    private BarDataSet dataSet;
    private LineDataSet dataSet1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chart_fragment_layout4, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        chart = (BarChart) getActivity().findViewById(R.id.bar2);
    }

}
