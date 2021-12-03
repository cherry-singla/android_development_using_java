package com.example.changingcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity{
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
    }

    public void showRed(View v){
        view.setBackgroundResource(R.color.red);
    }
    public void showYellow(View v){
        view.setBackgroundResource(R.color.yellow);
    }

    public void showGray(View v){
        view.setBackgroundResource(R.color.gray);
    }
    public void showTeal(View v){
        view.setBackgroundResource(R.color.teal_700);
    }
    public void showBlue(View v){
        view.setBackgroundResource(R.color.blue);
    }

    public void showGreen(View v){
        view.setBackgroundResource(R.color.green);
    }


//        Button red= findViewById(R.id.red);
//        Button gray= findViewById(R.id.gray);
//        Button orange= findViewById(R.id.orange);
//        Button green= findViewById(R.id.green);
//        Button purple= findViewById(R.id.purple);
//        Button blue= findViewById(R.id.blue);
//
//        red.setOnClickListener(this);
//        gray.setOnClickListener(this);
//        orange.setOnClickListener(this);
//        green.setOnClickListener(this);
//        purple.setOnClickListener(this);
//        blue.setOnClickListener(this);


//    @Override
//    public void onClick(View v) {
//
//        switch(v.getId()) {
//            case R.id.red:
//
//                break;
//            case R.id.gray:
//                // getWindow().getDecorView().setBackgroundColor(android.R.color.darker_gray);
//
//                break;
//            case R.id.orange:
//                //getWindow().getDecorView().setBackgroundColor(android.R.color.holo_orange_light);
//
//                break;
//            case R.id.green:
//                //getWindow().getDecorView().setBackgroundColor(android.R.color.holo_green_light);
//
//                break;
//            case R.id.purple:
//                //getWindow().getDecorView().setBackgroundColor(android.R.color.holo_purple);
//                break;
//            case R.id.blue:
//                //getWindow().getDecorView().setBackgroundColor(android.R.color.holo_blue_light);
//                break;
//
//        }}
}


