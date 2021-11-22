package com.example.contactpeople;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Messaging extends AppCompatActivity {

    EditText phone, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);
        phone = (EditText) findViewById(R.id.editTextPhone);
        message = (EditText) findViewById(R.id.editTextMessage);
    }


    public void sendMessage(View view) {
                int checkPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
                if (checkPermission == PackageManager.PERMISSION_GRANTED) {
                    sendTypedMessage();
                }
                else
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);
            }

            private void sendTypedMessage() {
                String string_phone = phone.getText().toString().trim();
                String string_message = message.getText().toString().trim();
                if (!string_phone.equals("") && !string_message.equals("")) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(string_phone, null, string_message, null, null);
                    Toast.makeText(this, "Message is sent successfully!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "Enter phone number and Message.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
                if (requestCode == 0) {
                    if (grantResults.length>=0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                        sendTypedMessage();
                    }
                    else{
                        Toast.makeText(this, "You have denied the required permission.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }