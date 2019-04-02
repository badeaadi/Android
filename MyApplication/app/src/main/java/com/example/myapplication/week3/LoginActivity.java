package com.example.myapplication.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {


    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private TextView mtextViewResult;
    private CheckBox mCheckBoxTerms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void submitDataOnClick(View view) {

        mEditTextEmail = findViewById(R.id.edit_text_address);
        mEditTextPhone = findViewById(R.id.edit_text_phone);
        mtextViewResult = findViewById(R.id.text_view_result);
        mCheckBoxTerms = findViewById(R.id.checkbox_terms)
    }
    private boolean isEmailValid() {
        if (mEditTextEmail != null) {
            String email = mEditTextEmail.getText().toString();
            if (!email.isEmpty()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    private boolean isPhoneValid() {
        if (mEditTextPhone != null) {
            String phone = mEditTextPhone.getText().toString();
            if (!phone.isEmpty()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    //TODO
    private boolean isAccepted() {
        if (mCheckBoxTerms != null)
           return (mCheckBoxTerms.isChecked());
        else
            return false;
    }
}
