package com.example.mappie.sciencemarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class passwordRecoverActivity extends AppCompatActivity {
    EditText emails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recover);
        emails =(EditText)findViewById(R.id.editText);
    }



    public void onRecover(View view){


String emailadd= emails.getText().toString();
String type ="recover";
BackgroundWorker backgroundWorker=new BackgroundWorker(this);
backgroundWorker.execute(type,emailadd);
    }
}
