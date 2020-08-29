package com.example.belajarintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityGedung_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gedung_a);
    }
    public void duaenam(View view){
        Intent duaenam = new Intent(ActivityGedung_A.this, ActivityRuang_A26.class);
        startActivity(duaenam);
    }
}