package com.example.contactpeople;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSendSms(View view) {
        Intent intent = new Intent(this, Messaging.class);
        startActivity(intent);
    }

    public void toDoPhone(View view) {
        Intent intent = new Intent(this, Phone.class);
        startActivity(intent);
    }
}