package com.example.mappie.sciencemarket;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class register extends AppCompatActivity {
EditText name,username,email,password,cnfpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.etName);
        username=(EditText)findViewById(R.id.etuserName);
        email=(EditText)findViewById(R.id.etEmail);
        password=(EditText)findViewById(R.id.et_password);
        cnfpassword=(EditText)findViewById(R.id.et_confirmpassword);
    }
    public void onReg (View view){

        String Username =username.getText().toString();

        String Password =password.getText().toString();

        String Name =name.getText().toString();


        String Emailad =email.getText().toString();
        String cnf=cnfpassword.getText().toString();
        if(Username.equals("")){
            username.setError("You can't leave it Empty");
        }
        if(Password.equals("")){
            password.setError("You can't leave it Empty");
        }
        if(Emailad.equals("")){
            email.setError("You can't leave it Empty");
        }
        if(!(Password.equals(cnf))){
            cnfpassword.setError("Password did not match");
        }
        if(Password.length()<8){
            password.setError("Password length should be 8 or more than 8");

        }
        if(Name.equals("")){
            name.setError("You can't leave it Empty");
        }
        if(!Username.equals("")&&!Name.equals("")&&!Password.equals("")&&!Emailad.equals("")&&!cnf.equals("")) {
            String type = "register";
            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, Username, Password, Name, Emailad);


        }
    }
    public void openLogin(View view){
        startActivity(new Intent(this,LoginActivity.class));
    }


}
