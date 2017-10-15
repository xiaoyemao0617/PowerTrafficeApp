package com.example.powertrafficeapp.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.powertrafficeapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by dell on 2017/07/30.
 */

public class Fragment_6 extends Fragment {
    int ss = 0;
    String week[] = {"昨天", "今天", "明天", "周五", "周六", "周日", "周一"};
    Handler handler = new Handler();
    Bar bar = new Bar();
    private BarChart chart;
    private LineChart lineChart;
    private Random random;
    private BarData data;
    private LineData data1;
    private LineData data2;
    private BarDataSet dataSet;
    private LineDataSet dataSet1;
    private LineDataSet dataSet2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout06, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lineChart = (LineChart) getActivity().findViewById(R.id.chart_line);
        chart = (BarChart) getActivity().findViewById(R.id.chart_f);
        handler.postDelayed(bar, 3000);
        LineChart();

    }

    public void barchart() {
        ArrayList<BarEntry> entries = new ArrayList<>();//显示条目
        ArrayList<String> xVals = new ArrayList<String>();//横坐标标签
        random = new Random();//随机数
        for (int i = 0; i < 12; i++) {
            int profit = random.nextInt(100);
            //entries.add(BarEntry(float val,int positon);
            entries.add(new BarEntry(profit, i));
            xVals.add((i + 1) + "月");
        }
        dataSet = new BarDataSet(entries, "公司年利润报表");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);//颜色模板
        data = new BarData(dataSet);
        chart.setData(data);
        //设置Y方向上动画animateY(int time);
        chart.animateY(3000);
        //图表描述
        Description description = new Description();
        description.setText("公司前半年财务报表(单位：万元)");
        chart.setDescription(description);
    }

    public void LineChart() {
        ArrayList<String> xeVals = new ArrayList<>();
        ArrayList<Entry> yVals = new ArrayList<>();
        ArrayList<Entry> yValse = new ArrayList<>();
        yVals.add(new Entry(15, 0));
        yVals.add(new Entry(4, 1));
        yVals.add(new Entry(6, 2));
        yVals.add(new Entry(9, 3));
        yVals.add(new Entry(12, 4));
        yVals.add(new Entry(15, 5));
        yVals.add(new Entry(12, 6));
        yValse.add(new Entry(15, 2));
        yValse.add(new Entry(4, 9));
        yValse.add(new Entry(6, 3));
        yValse.add(new Entry(9, 8));
        yValse.add(new Entry(12, 12));
        yValse.add(new Entry(15, 20));
        yValse.add(new Entry(12, 18));
        //   random = new Random();//产生随机数字
        for (int i = 0; i < week.length; i++) {
            xeVals.add(week[i]);
        }
        dataSet1 = new LineDataSet(yVals, "温度");//创建数据集并设置标签
        dataSet1.setValueTextColor(Color.BLUE);//设置Value值的显示文字颜色，字体大小和字体种类，这里我没有添加对应字体可以自己修改
        dataSet1.setValueTextSize(10.0f);
        dataSet1.setValueTypeface(null);
        dataSet2 = new LineDataSet(yValse, "温度cc");//创建数据集并设置标签
        dataSet2.setValueTextColor(Color.BLUE);//设置Value值的显示文字颜色，字体大小和字体种类，这里我没有添加对应字体可以自己修改
        dataSet2.setValueTextSize(10.0f);
        dataSet2.setColor(R.color.color1);
        dataSet2.setValueTypeface(null);
        data1 = new LineData(dataSet1);//创建LineData,x轴List和Y轴数据集为参数
        data1.addDataSet(dataSet2);
        Legend legend = lineChart.getLegend();
        legend.setTextColor(Color.CYAN); //设置Legend 文本颜色
        lineChart.setData(data1);//给图表添加数据
        Description description = new Description();
        description.setText("温度变化表");
        lineChart.setDescription(description);//设置图表描述的内容位置，字体等等
        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);//设置X轴的显示位置，通过XAxisPosition枚举类型来设置
        lineChart.getAxisRight().setEnabled(false);//关闭右边的Y轴，因为默认有两条，左边一条，右边一条，MPAndroidChart中有setEnabled方法的元素基本上都是使能的作用
        lineChart.animateY(3000);//动画效果，MPAndroidChart中还有很多动画效果可以挖掘

        lineChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {


            @Override
            public void onValueSelected(Entry entry, Highlight highlight) {
                //  Toast.makeText(getActivity(), String.valueOf(entry.getVal()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {
                // TODO Auto-generated method stub

            }
        });
    }

    class Bar implements Runnable {

        @Override
        public void run() {
            ss++;
            ArrayList<BarEntry> entries = new ArrayList<>();//显示条目
            final ArrayList<Integer> xVals = new ArrayList<>();//横坐标标签
            random = new Random();//随机数
            for (int i = 0; i < ss; i++) {
                int profit = random.nextInt(100);
                //entries.add(BarEntry(float val,int positon);
                entries.add(new BarEntry(i, profit));
                xVals.add(ss * 3);
            }
            XAxis xAxis = chart.getXAxis();
            xAxis.setValueFormatter(new IAxisValueFormatter() {
                @Override
                public String getFormattedValue(float v, AxisBase axisBase) {
                    return String.valueOf(xVals.get((int) v));
                }

                @Override
                public int getDecimalDigits() {
                    return 0;
                }
            });
            dataSet = new BarDataSet(entries, "公司年利润报表");
            dataSet.setColors(ColorTemplate.COLORFUL_COLORS);//颜色模板
            data = new BarData(dataSet);
            chart.setData(data);
            //设置Y方向上动画animateY(int time);
            chart.animateY(3000);
            //图表描述
            Description description = new Description();
            description.setText("公司前半年财务报表(单位：万元)");
            chart.setDescription(description);
            if (ss > 20) {
                handler.removeCallbacks(bar);
            } else {
                handler.postDelayed(bar, 3000);
            }

        }
    }
}
