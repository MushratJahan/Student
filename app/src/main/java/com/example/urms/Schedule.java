package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Schedule extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    ImageButton Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);

        Back=findViewById(R.id.backButton);
        Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Schedule.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bottomNavigationView= findViewById(R.id.nav_view);
        navController= Navigation.findNavController( this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}