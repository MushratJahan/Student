package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Result<id> extends AppCompatActivity implements Result_i {

    int id;
    TextView Course,Grade;
    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    RecyclerView recycler_view;
    GradeAdapter adapter;
    ImageButton Back;
    private Object GradeAdapter;
    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Back = findViewById(R.id.backButton);
        recycler_view = findViewById(R.id.recycler_view);
        setRecyclerView();

        Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
            }
        });


        bottomNavigationView = findViewById(R.id.nav_view);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GradeAdapter(this, getList());
        recycler_view.setAdapter(adapter);
    }

    private List<com.example.urms.Grade> getList() {
        return null;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_result, container, false);


        switch (id) {
            case 1001: {
                List<Grade> grade_list = new ArrayList<>();
                grade_list.add(new Grade("CSE101", "3.13"));
                grade_list.add(new Grade("CSE201", "3.125"));
                grade_list.add(new Grade("CSE433", "3.125"));
                grade_list.add(new Grade("CSE321", "3.225"));
                grade_list.add(new Grade("CSE401", "3.20"));
                grade_list.add(new Grade("CSE411", "3.3"));

                return (android.view.View) grade_list;
            }


            case 1002: {
                List<Grade> grade_list = new ArrayList<>();
                grade_list.add(new Grade("CSE101", "3.13"));
                grade_list.add(new Grade("CSE201", "3.125"));
                grade_list.add(new Grade("CSE433", "3.125"));
                grade_list.add(new Grade("CSE321", "3.225"));
                grade_list.add(new Grade("CSE401", "3.20"));
                grade_list.add(new Grade("CSE411", "3.3"));

                return (android.view.View) grade_list;
            }



            case 1003: {
                List<Grade> grade_list = new ArrayList<>();
                grade_list.add(new Grade("CSE101", "3.13"));
                grade_list.add(new Grade("CSE201", "3.125"));
                grade_list.add(new Grade("CSE433", "3.125"));
                grade_list.add(new Grade("CSE321", "3.225"));
                grade_list.add(new Grade("CSE401", "3.20"));
                grade_list.add(new Grade("CSE411", "3.3"));

                return (android.view.View) grade_list;

            }
            case 1004: {
                List<Grade> grade_list = new ArrayList<>();
                grade_list.add(new Grade("CSE101", "3.13"));
                grade_list.add(new Grade("CSE201", "3.125"));
                grade_list.add(new Grade("CSE433", "3.125"));
                grade_list.add(new Grade("CSE321", "3.225"));
                grade_list.add(new Grade("CSE401", "3.20"));
                grade_list.add(new Grade("CSE411", "3.3"));

                return (android.view.View) grade_list;
            }


            case 1005: {
                List<Grade> grade_list = new ArrayList<>();
                grade_list.add(new Grade("CSE101", "3.13"));
                grade_list.add(new Grade("CSE201", "3.125"));
                grade_list.add(new Grade("CSE433", "3.125"));
                grade_list.add(new Grade("CSE321", "3.225"));
                grade_list.add(new Grade("CSE401", "3.20"));
                grade_list.add(new Grade("CSE411", "3.3"));

                return (android.view.View) grade_list;
            }


        }
        return view;
    }
}