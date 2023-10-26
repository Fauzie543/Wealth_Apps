package com.example.cobadatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    EditText etUser, etPwd, etRepwd;
    Button btnRegister, btnGoToLogin;
    DBHelper dbHelper;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        etUser = findViewById(R.id.etUsername);
        etPwd = findViewById(R.id.etPassword);
        etRepwd = findViewById(R.id.etRePassword);
        btnRegister = findViewById(R.id.btnRegister);
        dbHelper = new DBHelper(this);
        btnGoToLogin = findViewById(R.id.btn_Login);
        btnGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, login.class);
                startActivity(intent);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user, pwd, rePwd;
                user = etUser.getText().toString();
                pwd = etPwd.getText().toString();
                rePwd = etRepwd.getText().toString();
                if (user.equals("") || pwd.equals("") || rePwd.equals("")) {
                    Toast.makeText(register.this, "Please fill all the fields", Toast.LENGTH_LONG).show();
                } else {
                    if(pwd.equals(rePwd)) {
                        if (dbHelper.checkUsername(user)){
                            Toast.makeText(register.this, "User Already Exists", Toast.LENGTH_LONG).show();
                            return;
                        }
                       boolean registeredSuccess = dbHelper.insertData(user, pwd);
                       if (registeredSuccess)
                           Toast.makeText(register.this, "User Registered Successfully", Toast.LENGTH_LONG).show();
                       else
                           Toast.makeText(register.this, "User Registration Failed", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(register.this, "password do not match", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
