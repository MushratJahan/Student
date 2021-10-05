package com.example.urms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<Courses> courseList;
    public Integer CourseCount=0;

    public CourseAdapter(Context context, List<Courses> courseList) {
        this.context = context;
        this.courseList = courseList;

    }


    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.peregistrationlist, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        if (courseList != null && courseList.size() > 0) {
            Courses list = courseList.get(position);

            holder.course_code.setText(list.getCourseCode());
            holder.myCheckBox.setOnCheckedChangeListener(null);
            holder.myCheckBox.setChecked(list.isSelected());


            holder.myCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    list.get(holder.getAdapterPosition()).setSelected(isChecked);
                }
            });

            if (true){
                holder.myCheckBox.setChecked(true);
                CourseCount = CourseCount++;
                if (CourseCount >= 5) {
                    System.out.println("You can not take more than four courses");
                } else {
                    return CourseCount;
                }
            }

            else{
                holder.myCheckBox.setChecked(false);
            }
        }

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView course_code;
        public CheckBox myCheckBox;
        public ViewHolder(@NonNull View courseView) {
            super(courseView);
            course_code=courseView.findViewById(R.id.course_code);
            myCheckBox =courseView.findViewById(R.id.myCheckBox);
        }
    }

}


