package com.example.urms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GradeAdapter extends RecyclerView.Adapter<GradeAdapter.ViewHolder> {
    Context context;
    List<Grade> grade_list;

    public GradeAdapter(Context context,List<Grade>grade_list) {
        this.context = context;
        this.grade_list = grade_list;
    }

    @NotNull
    @Override
    public GradeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.result_item,parent,false);

        return new GradeAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull GradeAdapter.ViewHolder holder, int position) {
        if (grade_list != null && grade_list.size() >0){
            Grade model = grade_list.get(position);
            holder.course_tv.setText(model.getCourse());
            holder.grade_tv.setText(model.getGrade());
        }else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return grade_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView course_tv,grade_tv;
        public ViewHolder(View itemView) {
            super(itemView);

            course_tv=itemView.findViewById(R.id.semester_tv);
            grade_tv=itemView.findViewById(R.id.cgpa_tv);

        }
    }
}