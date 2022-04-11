package com.example.zad5;

import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.widget.EditText;

public class ValidateFormat implements TextWatcher {
    private EditText input;
    private String error_msg;
    //private int input_type;

    public ValidateFormat(EditText input, String error_msg) {
        this.input = input;
        this.error_msg = error_msg;
        //this.input_type = input_type;
    }

    public EditText getInput() {
        return input;
    }

    public String getError_msg() {
        return error_msg;
    }



    public ValidateFormat() {
        super();
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        switch (input.getInputType()){
            case InputType
                    .TYPE_TEXT_VARIATION_EMAIL_ADDRESS | InputType.TYPE_CLASS_TEXT:{
                boolean isValid = validate_email(charSequence);
                if (!isValid){
                    input.setError(getError_msg());
                }
            }
            case InputType.TYPE_CLASS_PHONE:{
                boolean isValid = valide_phone(charSequence);
                if(!isValid){
                    input.setError(getError_msg());
                }
            }
        }

    }

    private boolean valide_phone(CharSequence charSequence) {
        String phonePattern = "[08]+[0-9]+";
        String input_text = charSequence.toString();
        return input_text.matches(phonePattern);
    }

    private boolean validate_email(CharSequence charSequence) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String input_text = charSequence.toString();
        return input_text.matches(emailPattern);
    }


    @Override
    public void afterTextChanged(Editable editable) {

    }
}
