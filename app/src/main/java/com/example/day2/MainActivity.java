package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
         private EditText editTxtEmail, editTxtPassword;
         private Button buttonA;
         private TextView txtEmailError, txtPassError;
         public String email, password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(validatePassword(editTxtPassword) && validateEmail(editTxtEmail))  {


                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                   email = editTxtEmail.getText().toString();
                   password = editTxtPassword.getText().toString();
                    intent.putExtra("email", email);
                    intent.putExtra("password", password);
                    startActivity(intent);
               }else
                   Toast.makeText(MainActivity.this, "Cannot move forward", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void initViews(){
        editTxtEmail = findViewById(R.id.editTxtEmail);
        editTxtPassword = findViewById(R.id.editTxtPassword);
        buttonA = findViewById(R.id.buttonA);
        txtEmailError = findViewById(R.id.txtEmailError);
        txtPassError = findViewById(R.id.txtPassError);


    }

    private boolean validateEmail(EditText email){
        if (email.getText().toString().isEmpty() || (!email.getText().toString().contains("@")) ){

            txtEmailError.setVisibility(View.VISIBLE);
            return false;
        }

        return true;
    }


    private boolean validatePassword(EditText password){
          if(password.getText().toString().isEmpty()){
              txtPassError.setVisibility(View.VISIBLE);
              return false;
          }
          return true;
    }


}