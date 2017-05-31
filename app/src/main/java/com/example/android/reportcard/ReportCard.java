package com.example.android.reportcard;

/**
 * Created by victo on 5/30/2017.
 */

public class ReportCard {

    private String mName;
    private int mGrade;
    private float mWeight;
    public float average;
    public float totalWeight;
    public float addedAverage;

    public ReportCard(String course, int grade, float weight) {
        mName = course;
        mGrade = grade;
        mWeight = weight;
    }

    public String getName() {
        return mName;
    }

    public String getGrade() {
        return Integer.toString(mGrade);
    }

    public String getWeight() {
        return Float.toString(mWeight);
    }

    public String getPass() {
        if (mGrade >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public String getAddedAverage() {
        average +=  mGrade * mWeight;
        totalWeight += mWeight;
        addedAverage = average / totalWeight;
        return Float.toString(addedAverage);
    }
}
