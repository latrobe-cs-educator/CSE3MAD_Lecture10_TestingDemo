package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but = null;
    TextView tv = null;
    int startVal = 0;

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
                int val = Integer.valueOf(tv.getText().toString()) * 2;
                tv.setText(String.valueOf(val));
            }
        });


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