package com.example.cobadatabase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    DBHelper dbHelper;
    Button btnlogin;
    EditText etUsername, etPwd;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.login);
        dbHelper = new DBHelper(this);
        etUsername = findViewById(R. id. etUsername);
        etPwd = findViewById(R. id.etPassword);
        btnlogin = findViewById(R. id. btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isloggedid = dbHelper.checkUser(etUsername.getText().toString(), etPwd.getText().toString());
                if(isloggedid)
                {
                    Intent intent = new Intent(login.this, home.class);
                    startActivity(intent);
                } else
                    Toast.makeText( login.this, "login Failed", Toast.LENGTH_LONG).show();

            }
        });
    }
}
