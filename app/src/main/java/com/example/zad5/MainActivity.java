package com.example.zad5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

    @Override
    void create_intent(){

         intent = new Intent(MainActivity.this, MainActivity2.class);
    }

    @Override
    public void onClick(View view) {
        create_intent();
        super.onClick(view);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.goto_2);
        button.setOnClickListener(this);

        EditText email = findViewById(R.id.email);
        email.addTextChangedListener(new ValidateFormat(email, "Not valid email!"));



    }

}