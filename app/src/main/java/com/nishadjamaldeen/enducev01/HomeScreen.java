package com.nishadjamaldeen.enducev01;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeScreen extends AppCompatActivity {

    private final String TAG = "Home Page";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);


    }

    public void changeTreatment(View view){
        Intent intent = new Intent(this, changetreatment.class);
        startActivity(intent);

    }

    public void newTreatment(View view){
        Log.e(TAG, "Clicked!");
    }

    public void getAnalytics(View view){
        Log.e(TAG, "Clicked!");
    }
}
