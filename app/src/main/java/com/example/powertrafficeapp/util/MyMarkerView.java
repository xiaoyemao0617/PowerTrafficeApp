package com.example.powertrafficeapp.util;

import android.content.Context;
import android.widget.TextView;

import com.example.powertrafficeapp.R;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;


/**
 * Created by dell on 2017/08/31.
 */

public class MyMarkerView extends MarkerView {
    TextView textview_chart_line;

    public MyMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);
        textview_chart_line = (TextView) findViewById(R.id.Textview_chart_line);
    }

    @Override
    public void refreshContent(Entry entry, Highlight highlight) {
        textview_chart_line.setText("" + entry.getY());
    }

}
