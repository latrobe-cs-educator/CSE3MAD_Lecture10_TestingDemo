package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button but = null;
    TextView tv = null;
    int startVal = 0;
    String TAG = "MyMainAct";
    Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.editText);
        but = findViewById(R.id.calcButton);
        //tv.setText(String.valueOf(startVal));
        calc = new Calculator();

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get value from edit text
                String in = tv.getText().toString();
                if(isInt(in))
                {
                    int inputValue = calc.doubleValue(Integer.parseInt(in));
                    Log.d(TAG, "Value cale returns is  : " + inputValue);
                    tv.setText(String.valueOf(inputValue));
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please enter valid int", Toast.LENGTH_LONG ).show();
                }
            }
        });

        //debugging
        int divisor = 1;
        //int divisor = 0; crash value
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
            case "Luke":
                lastName = "Bozzetto";
                break;
            default:
                lastName = "Doe";
                break;
        }
        return lastName;
    }

    //Check if string can be parsed as int value
    private boolean isInt(String val)
    {
        try
        {
            Integer.parseInt(val);
            Log.d(TAG, "Value is int : " + val);
            return true;
        } catch (NumberFormatException ex)
        {
            Log.d(TAG, "Exception: " + ex);
            return false;
        }
    }
}