package com.rukina.fortunevasthu.activity;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rukina.fortunevasthu.R;

/**
 * Created by Cube Reach 06 on 26-11-2016.
 */

public class LoginActivity extends AppCompatActivity {

    EditText _Name, _Email, _Mobile;
    private TextInputLayout inputEmployeeName, inputLayoutEmail, inputLayoutMobile;
    Button _Submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        init();

        Toast.makeText(getApplicationContext(), "Please register to get the vasthu report !", Toast.LENGTH_LONG).show();
    }

    private void init()
    {
        _Name = (EditText) findViewById(R.id.et_name);
        _Email = (EditText) findViewById(R.id.et_Email);
        _Mobile = (EditText) findViewById(R.id.et_mobile);
        _Submit = (Button) findViewById(R.id.btn_submit);

        inputEmployeeName = (TextInputLayout) findViewById(R.id.input_layout_name);
        inputLayoutEmail = (TextInputLayout) findViewById(R.id.input_layout_email);
        inputLayoutMobile = (TextInputLayout) findViewById(R.id.input_layout_mobile);
    }
}
