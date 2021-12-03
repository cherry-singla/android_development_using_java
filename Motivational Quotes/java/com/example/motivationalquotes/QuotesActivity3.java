package com.example.motivationalquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuotesActivity3 extends AppCompatActivity {
    private Button next3, previous3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes3);

        next3 = (Button) findViewById(R.id.next3);
        previous3 = (Button) findViewById(R.id.previous3);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuotesActivity4();
            }
        });
        previous3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuotesActivity2();
            }
        });
    }
    public  void openQuotesActivity4(){
        Intent intent = new Intent(this, QuotesActivity4.class);
        startActivity(intent);
    }
    public  void openQuotesActivity2(){
        Intent intent = new Intent(this, QuotesActivity2.class);
        startActivity(intent);
    }
}