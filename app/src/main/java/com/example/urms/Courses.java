package com.example.urms;

import android.view.View;
import android.widget.RadioButton;

public class Courses {
    String courseCode;
    private boolean isSelected;

    public Courses(String courseCode) {

        this.courseCode =courseCode;
    }

    public String getCourseCode() {

        return courseCode;
    }


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isChecked) {
        isSelected = isChecked;
    }


    public Courses get(long adapterPosition) {
        return null;///not sure dont know
    }
}

