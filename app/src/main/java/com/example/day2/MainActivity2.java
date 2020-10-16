package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   private TextView txtEmailValue, txtPasswordValue;
   public String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtEmailValue = findViewById(R.id.txtEmailValue);
        txtPasswordValue = findViewById(R.id.txtPasswordValue);

       email = getIntent().getExtras().getString("email");
       password = getIntent().getExtras().getString("password");

        txtEmailValue.setText(email);
        txtPasswordValue.setText(password);

    }
}