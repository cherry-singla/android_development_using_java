package com.example.motivationalquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.next1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openQuotesActivity2();
            }
        });
    }
    public  void openQuotesActivity2(){
        Intent intent = new Intent(this, QuotesActivity2.class);
        startActivity(intent);
    }
}