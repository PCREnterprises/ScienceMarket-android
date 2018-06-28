package com.example.mappie.sciencemarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText  UsernameEt,PasswordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        UsernameEt=(EditText)findViewById(R.id.user_name);
        PasswordEt=(EditText)findViewById(R.id.user_password);
    }
    public void onLogin(View view){


        String username =UsernameEt.getText().toString();

        String password =PasswordEt.getText().toString();
        String type= "login";
        if(username.equals("")){
            UsernameEt.setError("You can't leave it Empty");
        }
        if(password.equals("")){
            PasswordEt.setError("You can't leave it Empty");
        }
        if(!username.equals("")&&!password.equals("")) {
            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, password, username);
        }
    }
    public void openReg(View view){


        startActivity(new Intent(this,register.class));
    }
    public void openRecover(View view){
     startActivity(new Intent(this,passwordRecoverActivity.class));
    }
}
