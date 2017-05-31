package com.example.android.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by victo on 5/30/2017.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> courses) {
        super(context, 0, courses);}


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        ReportCard currentItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.list_item_grade);
        TextView weightTextView = (TextView) listItemView.findViewById(R.id.list_item_weight);
        TextView passTextView = (TextView) listItemView.findViewById(R.id.list_item_pass);
        TextView averageTextView = (TextView) listItemView.findViewById(R.id.list_item_average);

        nameTextView.setText(currentItem.getName());
        gradeTextView.setText(currentItem.getGrade());
        weightTextView.setText(currentItem.getWeight());
        passTextView.setText(currentItem.getPass());
        averageTextView.setText(currentItem.getAddedAverage());

        return listItemView;

    }
}
