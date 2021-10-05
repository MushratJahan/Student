package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class PreRegistration extends AppCompatActivity {
    RecyclerView recyclerView1;
    CourseAdapter adapter;
    private BottomNavigationView bottomNavigationView;
    private NavController navController;

    ImageButton Back;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_registration);
        recyclerView1= findViewById(R.id.recyclerView1);
        setRecyclerView();

        Back=findViewById(R.id.backButton);
        submitButton=findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("You can not make any change");
                //then student can not change anything
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreRegistration.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bottomNavigationView= findViewById(R.id.nav_view);
        navController= Navigation.findNavController( this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }


    private  void setRecyclerView(){

        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        adapter= new CourseAdapter(this,getList());
        recyclerView1.setAdapter(adapter);
    }



    private List<Courses>getList(){
        List<Courses>coursesList= new ArrayList<>();
        coursesList.add(new Courses("CSE101"));  ////need to add checkbox//
        coursesList.add(new Courses("CSE201"));
        coursesList.add(new Courses("CSE202"));
        coursesList.add(new Courses("CSE205"));
        coursesList.add(new Courses("CSE301"));
        coursesList.add(new Courses("CSE302"));
        coursesList.add(new Courses("CSE304"));
        coursesList.add(new Courses("CSE401"));
        coursesList.add(new Courses("CSE402"));
        coursesList.add(new Courses("CSE499"));
        coursesList.add(new Courses("MAT101"));
        coursesList.add(new Courses("MAT201"));
        coursesList.add(new Courses("ENG101"));
        coursesList.add(new Courses("ENG201"));
        coursesList.add(new Courses("EEE101"));
        coursesList.add(new Courses("EEE201"));
        coursesList.add(new Courses("EEE202"));
        coursesList.add(new Courses("GED100"));

        return coursesList;
    }





}

