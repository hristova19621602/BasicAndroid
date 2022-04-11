package com.example.zad5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

abstract  class BaseActivity extends AppCompatActivity implements View.OnClickListener{
    protected Intent intent;

    abstract void create_intent();
    @Override
    public void onClick(View view) {
        if(intent != null){
          startActivity(intent);
        }
        else
        {
            Log.e(getString(R.string.ZAD5_TAG), "Intent is NULL!");
        }


    }
}
