package com.e.api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    private Button btnRegisterEmployee, btnShowAll, btnUpdateEmployee, btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnRegisterEmployee = findViewById(R.id.btnRegisterUser);
        btnShowAll = findViewById(R.id.btnShowAll);
        btnSearch= findViewById(R.id.btnSearch);
        btnUpdateEmployee= findViewById(R.id.btnUpdateUser);


    }
}
