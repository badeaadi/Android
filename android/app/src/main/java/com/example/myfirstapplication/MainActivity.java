package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewHello;
    private EditText mEditTextEmail;
    private RatingBar mRatingBar;

    //    m-membru al clasei
//    s-static
//    caps lock-constanta
//    metoda camel case
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTextViewHello = findViewById(R.id.textview_Hello);
        mTextViewHello.setText(getString(R.string.hello_java));
        mEditTextEmail = findViewById(R.id.editText);
        mRatingBar = findViewById(R.id.rating_bar);
    }


    public void btnHelloOnClick(View view) {
        mRatingBar.setVisibility(View.GONE);
        if (mEditTextEmail != null) {
            String email = mEditTextEmail.getText().toString();
            if (email != null && !email.isEmpty()) {
                mTextViewHello.setText(email);
            } else {
                mEditTextEmail.setError(getString(R.string.error_email_missing));
            }
        } else {
            Toast.makeText(MainActivity.this, "Please make EditText not null", Toast.LENGTH_LONG).show();
        }

    }
}

