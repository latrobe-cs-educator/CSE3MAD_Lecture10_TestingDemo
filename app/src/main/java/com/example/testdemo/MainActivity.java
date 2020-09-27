package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but = null;
    TextView tv = null;
    int startVal = 0;
    String TAG = "MyMainAct";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.editText);
        but = findViewById(R.id.calcButton);
        tv.setText(String.valueOf(startVal));

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tv.getText().toString()) * 2;
                tv.setText(String.valueOf(val));
            }
        });

        //debugging
        int divisor = 1;
        Log.d("demoNow","divisor value: " + divisor);
        int crash = 9/divisor;



    }

    //Lecture Demo
    public String getLastName(String firstName) {
        String lastName = "";

        switch (firstName) {
            case "Scott":
                lastName = "Mann";
                break;
            case "Marita":
                lastName = "Fitzgerald";
                break;
            case "Shaarang":
                lastName = "Tanpure";
                break;
            default:
                lastName = "Doe";
                break;
        }
        return lastName;
    }
}