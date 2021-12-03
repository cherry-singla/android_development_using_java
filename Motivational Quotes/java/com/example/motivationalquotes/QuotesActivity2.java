package com.example.motivationalquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuotesActivity2 extends AppCompatActivity {
    private Button next2, previous2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes2);

        next2 = (Button) findViewById(R.id.next2);
        previous2 = (Button) findViewById(R.id.previous2);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuotesActivity3();
            }
        });
        previous2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuotesActivity1();
            }
        });
    }
    public  void openQuotesActivity3(){
        Intent intent = new Intent(this, QuotesActivity3.class);
        startActivity(intent);
    }
    public  void openQuotesActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    }
