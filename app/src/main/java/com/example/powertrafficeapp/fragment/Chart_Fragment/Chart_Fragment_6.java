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

public class Chart_Fragment_6 extends Fragment {
    private BarChart chart;
    private LineChart lineChart;

    private Random random;

    private BarData data;
    private LineData data1;
    private BarDataSet dataSet;
    private LineDataSet dataSet1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chart_fragment_layout6, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        chart = (BarChart) getActivity().findViewById(R.id.bar3);
    }
//        barchart();
//
//
//
//    public void barchart() {
//        ArrayList<BarEntry> entries = new ArrayList<>();//显示条目
//        ArrayList<String> xVals = new ArrayList<String>();//横坐标标签
//        random = new Random();//随机数
//        for (int i = 0; i < 12; i++) {
//            int profit = random.nextInt(100);
//            //entries.add(BarEntry(float val,int positon);
//            entries.add(new BarEntry(profit, i));
//            xVals.add((i + 1) + "月");
//        }
//        dataSet = new BarDataSet(entries, "温度变化表");
//        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);//颜色模板
//        data = new BarData(xVals, dataSet);
//        chart.setData(data);
//        //设置Y方向上动画animateY(int time);
//        chart.animateY(3000);
//        //图表描述
//        chart.setDescription("温度变化表(单位:摄氏度)");
//    }
}
