package com.example.zad5;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ValidateLength implements TextWatcher {
    private EditText inputText;
    private String error_msg;
    private int min_len;
    private int max_len;

    public ValidateLength(EditText inputText, String error_msg, int min_len, int max_len) {
        this.inputText = inputText;
        this.error_msg = error_msg;
        this.min_len = min_len;
        this.max_len = max_len;
    }

    public EditText getInputText() {
        return inputText;
    }

    public String getError_msg() {
        return error_msg;
    }

    public int getMin_len() {
        return min_len;
    }

    public int getMax_len() {
        return max_len;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (charSequence.length() < getMin_len() || charSequence.length() > getMax_len())
            getInputText().setError(getError_msg());

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
