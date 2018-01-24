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

import com.nishadjamaldeen.enducev01.data.Treatment;

import java.io.Serializable;
import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    private final String TAG = "Home Page";
    ArrayList<Treatment> treatments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        setTitle("Enduce");

        Treatment treatment1 = new Treatment("Monday", 20, 14, 18);
        Treatment treatment2 = new Treatment("Tuesday", 24, 15, 18);
        Treatment treatment3 = new Treatment("Wednesday", 16, 21, 35);

        treatments.add(treatment2);
        treatments.add(treatment1);
        treatments.add(treatment3);


    }

    public void changeTreatment(View view){
        Intent intent = new Intent(this, changetreatment.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("treatments",(Serializable) treatments);
        intent.putExtra("treatments", bundle);
        startActivity(intent);

    }

    public void newTreatment(View view){
        Log.e(TAG, "Clicked!");
    }

    public void getAnalytics(View view){
        Log.e(TAG, "Clicked!");
    }
}
