package com.example.powertrafficeapp.fragment.Chart_Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.powertrafficeapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.Random;


/**
 * Created by dell on 2017/08/01.
 */

public class Chart_Fragment_5 extends Fragment {
    String week[] = {"昨天", "今天", "明天", "周五", "周六", "周日", "周一"};
    private BarChart chart;
    private LineChart lineChart;
    private Random random;
    private LineData data1;
    private LineDataSet dataSet1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chart_fragment_layout5, container, false);
        return view;
    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        lineChart=(LineChart) getActivity().findViewById(R.id.chart3);
//        LineChart();
//
//    }
//    public  void LineChart(){
//        ArrayList<String> xeVals = new ArrayList<>();
//        ArrayList<Entry> yVals = new ArrayList<>();
//        random = new Random();//产生随机数字
//
//        for(int i = 0 ; i<week.length; i++) {
//            float x = random.nextInt(50);//获取value值
//            yVals.add(new Entry(x, i));//创建Entry并且添加到Y值的list中，Y轴的值，一个entry代表一个显示的值
//            xeVals.add(week[i]);//横坐标显示xxx月
//        }
//
//        dataSet1 = new LineDataSet(yVals, "温度");//创建数据集并设置标签
//        dataSet1.setColors(ColorTemplate.COLORFUL_COLORS);//设置数据集显示的颜色，预支颜色模版ColorTemplate，也可以设置单一颜色和colors
//        dataSet1.setHighlightEnabled(true);//设置高亮
//        dataSet1.setValueTextColor(Color.BLUE);//设置Value值的显示文字颜色，字体大小和字体种类，这里我没有添加对应字体可以自己修改
//        dataSet1.setValueTextSize(10.0f);
//        dataSet1.setValueTypeface(null);
//        data1 = new LineData(xeVals, dataSet1);//创建LineData,x轴List和Y轴数据集为参数
//
//        lineChart.setData(data1);//给图表添加数据
//        lineChart.setDescription("温度变化表");//设置图表描述的内容位置，字体等等
//        lineChart.setDescriptionColor(Color.BLACK);
//        lineChart.setDescriptionTextSize(15f);
//        lineChart.setDescriptionPosition(540, 40);
//
//        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);//设置X轴的显示位置，通过XAxisPosition枚举类型来设置
//        //   lineChart.getXAxis().setAxisMinValue(0.0f);//设置X轴的最小值
//        lineChart.getAxisRight().setEnabled(false);//关闭右边的Y轴，因为默认有两条，左边一条，右边一条，MPAndroidChart中有setEnabled方法的元素基本上都是使能的作用
//        lineChart.animateY(3000);//动画效果，MPAndroidChart中还有很多动画效果可以挖掘
//
////当值被选中的时候，执行操作显示一个Toast
//        lineChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
//
//            @Override
//            public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
//                // TODO Auto-generated method stub
//                Toast.makeText(getActivity(), String.valueOf(e.getVal()), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected() {
//                // TODO Auto-generated method stub
//
//            }
//        });
//    }
}
