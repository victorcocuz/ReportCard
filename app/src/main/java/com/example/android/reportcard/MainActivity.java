package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> courses = new ArrayList<>();

        courses.add(new ReportCard("Studio", 82, 3));
        courses.add(new ReportCard("Iconography", 91, 2));
        courses.add(new ReportCard("Visual Communication", 75, 1));
        courses.add(new ReportCard("Structures", 48, 1));
        courses.add(new ReportCard("Environmental Studies", 94, 1));

        ReportCardAdapter CourseAdapter = new ReportCardAdapter(this, courses);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(CourseAdapter);


    }
}
