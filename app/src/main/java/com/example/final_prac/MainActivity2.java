package com.example.final_prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView t2;
    private Spinner spinner;
    private ImageView image1;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t2 = findViewById(R.id.t2);
        String new1 = getIntent().getStringExtra("name");
        t2.setText(new1);
        spinner = findViewById(R.id.spinner);
        image1=findViewById(R.id.image1);
        SpinnerAdapter adapter = ArrayAdapter.createFromResource(this, R.array.order, android.R.layout.simple_spinner_item);
        ((ArrayAdapter<?>) adapter).setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        image1.setImageResource(R.drawable.coffee);
                        break;
                    case 2:
                        image1.setImageResource(R.drawable.sand);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}