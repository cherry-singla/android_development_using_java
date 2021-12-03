
package com.example.motivationalquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuotesActivity4 extends AppCompatActivity {
    private  Button previous4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes4);
        previous4 = (Button) findViewById(R.id.previous4);
        previous4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuotesActivity3();
            }
        });
    }
    public  void openQuotesActivity3(){
        Intent intent = new Intent(this, QuotesActivity3.class);
        startActivity(intent);
    }
}