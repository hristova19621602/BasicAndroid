package com.example.zad5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends BaseActivity {

    private TextView texMailSecAct;
    private EditText textName, textAddress, textCity, textPhone;
    @Override
    void create_intent() {
        intent = new Intent(MainActivity2.this, MainActivity3.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText editName = findViewById(R.id.name);
        EditText editAddress = findViewById(R.id.address);
        EditText editCity = findViewById(R.id.city);
        EditText editPhone = findViewById(R.id.phone);

        editName.addTextChangedListener(new ValidateLength(editName, getString(R.string.range_error), 2, 100));
        editAddress.addTextChangedListener(new ValidateLength(editAddress,getString(R.string.range_error), 5, 255));
        editCity.addTextChangedListener(new ValidateLength(editCity,getString(R.string.range_error), 5, 150));
        editPhone.addTextChangedListener(new ValidateLength(editPhone,getString(R.string.range_error), 10, 10));

        editPhone.addTextChangedListener(new ValidateFormat(editPhone,getString(R.string.phone_err)));

        Button goToA3 = findViewById(R.id.nextButton);
        goToA3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        create_intent();
        String mail = texMailSecAct.getText().toString();
        String name = textName.getText().toString();
        String address = textAddress.getText().toString();
        String city = textCity.getText().toString();
        String phone = textPhone.getText().toString();

        People people = new People(mail, name, address, city, phone);
        intent.putExtra("final", people);
        super.onClick(view);
    }
}