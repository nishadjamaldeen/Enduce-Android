package com.nishadjamaldeen.enducev01;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.login);

        loginButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
                            launchHomePage();

                        }else{
                            Toast.makeText(login.this, "Username and/or password incorrect!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    private void launchHomePage(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}

//    protected void loginUser(View view){
//        final EditText username = (EditText) findViewById(R.id.username);
//        final EditText password = (EditText) findViewById(R.id.password);
//        Button loginButton = (Button) findViewById(R.id.button);
//
//        loginButton.setOnClickListener(
//                new View.OnClickListener(){
//                    @Override
//                    public void onClick(View v){
//                        Log.i(TAG, "reached here");
//                        if (username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
//
//                        }else{
//                            Toast.makeText(login.this, "Username and/or password is incorrect", Toast.LENGTH_LONG);
//                        }
//                    }
//                }
//        );
//
//
//    }

