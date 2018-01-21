package com.nishadjamaldeen.enducev01;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        TextView brand = (TextView) findViewById(R.id.title);
        Typeface font = Typeface.createFromAsset(getAssets(), "Raleway-Medium.ttf");
        brand.setTypeface(font);
        Animation titleIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeandrise);
        brand.startAnimation(titleIn);
        Log.e("reached here", "reached here");
        ImageView ld1 = (ImageView) findViewById(R.id.ld1);
        ImageView ld2 = (ImageView) findViewById(R.id.ld2);
        ImageView ld3 = (ImageView) findViewById(R.id.ld3);
        Animation lda1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.loadingdotone);
        Animation lda2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.loadingdottwo);
        Animation lda3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.loadingdotthree);
        ld1.startAnimation(lda1);
        ld2.startAnimation(lda2);
        ld3.startAnimation(lda3);



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                launchLoginActivity();
            }
        }, 5000);


    }

    private void launchLoginActivity(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }



}
