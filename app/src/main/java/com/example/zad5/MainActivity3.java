package com.example.zad5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends BaseActivity {

    @Override
    void create_intent() {
        intent = new Intent(MainActivity3.this, MainActivity2.class);
    }

    @Override
    public void onClick(View view) {
        create_intent();
        super.onClick(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView final_txt = findViewById(R.id.textView);
        Intent oIntent = getIntent(); //създаваме на интент
        People strName = oIntent.getParcelableExtra("obj"); //слагаме в променлива съдържанието на интента
        final_txt.setText(strName.toString());
    }
}