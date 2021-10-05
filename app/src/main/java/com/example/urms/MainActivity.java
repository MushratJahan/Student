package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements MActivity {
    Button Preregistration, Schedule, Billing, Result, LogOut;
    private BottomNavigationView bottomNavigationView;
    private  NavController navController;
    //private MainActivity mGoogleSignInClient;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container, false);
        Preregistration= view.findViewById(R.id.button1);
        Schedule= view.findViewById(R.id.button2);
        Billing= view.findViewById(R.id.button3);
        Result=view.findViewById(R.id.button4);
        LogOut= view.findViewById(R.id.button5);

        return view;
    }
    public void buttonClicked(View view) {

        if (view.getId() == R.id.button1) {
            Intent intent = new Intent(MainActivity.this,PreRegistration.class);
            startActivity(intent);
        } else if (view.getId() == R.id.button2) {

            Intent intent = new Intent(MainActivity.this, Schedule.class);
            startActivity(intent);
        } else if (view.getId() == R.id.button3) {
            Intent intent = new Intent(MainActivity.this,Billing.class);
            startActivity(intent);
        }else if (view.getId() == R.id.button4) {
            Intent intent = new Intent(MainActivity.this,Result.class);
            startActivity(intent);
        }else if (view.getId() == R.id.button5) {
            Intent intent = new Intent(MainActivity.this,LogOut.class);
            startActivity(intent);

                }
        else if (view.getId() == R.id.backButton) {
            Intent intent = new Intent(MainActivity.this,LogOut.class);
            startActivity(intent);

        }
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView= findViewById(R.id.nav_view);
        navController= Navigation.findNavController( this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }


}
