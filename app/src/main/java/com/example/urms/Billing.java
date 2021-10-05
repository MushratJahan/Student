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

public class Billing extends AppCompatActivity implements Billing_i {
    int id;
    TextView Date, Payment;

    RecyclerView recycler_view;
    PaymentAdapter adapter;
    ImageButton Back;
    private BottomNavigationView bottomNavigationView;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);
        Back = findViewById(R.id.backButton);
        recycler_view = findViewById(R.id.recycler_view);
        setRecyclerView();

        bottomNavigationView = findViewById(R.id.nav_view);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


        Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Billing.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PaymentAdapter(this, getList());
        recycler_view.setAdapter(adapter);
    }

    private List<com.example.urms.Payment> getList() {
        return null;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_result, container, false);


        switch (id) {
            case 1001: {
                List<Payment> payment_list = new ArrayList<>();
                payment_list.add(new Payment("1-08-2017", "10000"));
                payment_list.add(new Payment("2-10-2017", "40000"));
                payment_list.add(new Payment("3-01-2017", "20000"));
                payment_list.add(new Payment("4-09-2018", "36000"));
                payment_list.add(new Payment("5-02-2018", "14000"));
                payment_list.add(new Payment("1-08-2018", "10000"));
                payment_list.add(new Payment("2-10-2019", "40000"));
                payment_list.add(new Payment("3-01-2019", "20000"));
                payment_list.add(new Payment("4-04-2019", "36000"));
                payment_list.add(new Payment("5-09-2019", "14000"));
                payment_list.add(new Payment("5-02-2020", "14000"));
                payment_list.add(new Payment("1-08-2020", "10000"));
                payment_list.add(new Payment("2-10-2020", "40000"));
                payment_list.add(new Payment("3-01-2021", "20000"));
                payment_list.add(new Payment("4-04-2021", "36000"));
                payment_list.add(new Payment("5-09-2021", "14000"));
                return (View) payment_list;
            }


            case 1002: {
                List<Payment> payment_list = new ArrayList<>();
                payment_list.add(new Payment("1-08-2017", "10000"));
                payment_list.add(new Payment("2-10-2017", "40000"));
                payment_list.add(new Payment("3-01-2017", "20000"));
                payment_list.add(new Payment("4-09-2018", "36000"));
                payment_list.add(new Payment("5-02-2018", "14000"));
                payment_list.add(new Payment("1-08-2018", "10000"));
                payment_list.add(new Payment("2-10-2019", "40000"));
                payment_list.add(new Payment("3-01-2019", "20000"));
                payment_list.add(new Payment("4-04-2019", "36000"));
                payment_list.add(new Payment("5-09-2019", "14000"));
                payment_list.add(new Payment("5-02-2020", "14000"));
                payment_list.add(new Payment("1-08-2020", "10000"));
                payment_list.add(new Payment("2-10-2020", "40000"));
                payment_list.add(new Payment("3-01-2021", "20000"));
                payment_list.add(new Payment("4-04-2021", "36000"));
                payment_list.add(new Payment("5-09-2021", "14000"));
                return (View) payment_list;
            }


            case 1003: {
                List<Payment> payment_list = new ArrayList<>();
                payment_list.add(new Payment("1-08-2017", "10000"));
                payment_list.add(new Payment("2-10-2017", "40000"));
                payment_list.add(new Payment("3-01-2017", "20000"));
                payment_list.add(new Payment("4-09-2018", "36000"));
                payment_list.add(new Payment("5-02-2018", "14000"));
                payment_list.add(new Payment("1-08-2018", "10000"));
                payment_list.add(new Payment("2-10-2019", "40000"));
                payment_list.add(new Payment("3-01-2019", "20000"));
                payment_list.add(new Payment("4-04-2019", "36000"));
                payment_list.add(new Payment("5-09-2019", "14000"));
                payment_list.add(new Payment("5-02-2020", "14000"));
                payment_list.add(new Payment("1-08-2020", "10000"));
                payment_list.add(new Payment("2-10-2020", "40000"));
                payment_list.add(new Payment("3-01-2021", "20000"));
                payment_list.add(new Payment("4-04-2021", "36000"));
                payment_list.add(new Payment("5-09-2021", "14000"));
                return (View) payment_list;

            }
            case 1004: {
                List<Payment> payment_list = new ArrayList<>();
                payment_list.add(new Payment("1-08-2017", "10000"));
                payment_list.add(new Payment("2-10-2017", "40000"));
                payment_list.add(new Payment("3-01-2017", "20000"));
                payment_list.add(new Payment("4-09-2018", "36000"));
                payment_list.add(new Payment("5-02-2018", "14000"));
                payment_list.add(new Payment("1-08-2018", "10000"));
                payment_list.add(new Payment("2-10-2019", "40000"));
                payment_list.add(new Payment("3-01-2019", "20000"));
                payment_list.add(new Payment("4-04-2019", "36000"));
                payment_list.add(new Payment("5-09-2019", "14000"));
                payment_list.add(new Payment("5-02-2020", "14000"));
                payment_list.add(new Payment("1-08-2020", "10000"));
                payment_list.add(new Payment("2-10-2020", "40000"));
                payment_list.add(new Payment("3-01-2021", "20000"));
                payment_list.add(new Payment("4-04-2021", "36000"));
                payment_list.add(new Payment("5-09-2021", "14000"));
                return (View) payment_list;
            }


            case 1005: {
                List<Payment> payment_list = new ArrayList<>();
                payment_list.add(new Payment("1-08-2017", "10000"));
                payment_list.add(new Payment("2-10-2017", "40000"));
                payment_list.add(new Payment("3-01-2017", "20000"));
                payment_list.add(new Payment("4-09-2018", "36000"));
                payment_list.add(new Payment("5-02-2018", "14000"));
                payment_list.add(new Payment("1-08-2018", "10000"));
                payment_list.add(new Payment("2-10-2019", "40000"));
                payment_list.add(new Payment("3-01-2019", "20000"));
                payment_list.add(new Payment("4-04-2019", "36000"));
                payment_list.add(new Payment("5-09-2019", "14000"));
                payment_list.add(new Payment("5-02-2020", "14000"));
                payment_list.add(new Payment("1-08-2020", "10000"));
                payment_list.add(new Payment("2-10-2020", "40000"));
                payment_list.add(new Payment("3-01-2021", "20000"));
                payment_list.add(new Payment("4-04-2021", "36000"));
                payment_list.add(new Payment("5-09-2021", "14000"));
                return (View) payment_list;
            }


        }
        return view;
    }
}






