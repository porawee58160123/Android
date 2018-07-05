package com.porawee.myfirstgraph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPiechart();
    }
    private void initPiechart(){
        PieChart chart = (PieChart)findViewById(R.id.piechart);
        ArrayList<Student> listStudent= Student.getSampleStudentData( 4);
        ArrayList<PieEntry> entries = new ArrayList<>();

        for(Student student : listStudent){
            entries.add(new PieEntry(student.getScore(),student.getName()));
        }
        PieDataSet dataset = new PieDataSet(entries, "student");
        dataset.setSelectionShift(10);
        dataset.setValueTextSize(14);
        dataset.setColors(ColorTemplate.PASTEL_COLORS);
        dataset.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);

        dataset.setValueLinePart1Length(0.5f);
        dataset.setValueLinePart2Length(0.5f);

        dataset.setValueFormatter(new PercentFormatter());

        PieData data = new PieData(dataset);
        chart.setData(data);
        chart.setHoleRadius(30);
        chart.setTransparentCircleRadius(40);
        chart.animateY(3000);
        chart.animateX(3000, Easing.EasingOption.EaseInBounce);
        chart.setUsePercentValues(true);
        chart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {

            }

            @Override
            public void onNothingSelected() {

            }
        });
    }
}