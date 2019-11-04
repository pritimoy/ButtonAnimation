package com.codesmith.buttonanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

public class MainActivity extends AppCompatActivity {
    View ovalOne, ovalTwo, circleFont;
    int currentRotation = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ovalOne = findViewById(R.id.oval_one);
        ovalTwo = findViewById(R.id.oval_tow);
        circleFont = findViewById(R.id.circal_fornt);

        circleFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RotateAnimation anim = new RotateAnimation(currentRotation, currentRotation + 1800,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                currentRotation = (currentRotation + 30) % 360;
                anim.setInterpolator(new LinearInterpolator());
                anim.setDuration(45000);
                anim.setFillEnabled(true);
                anim.setFillAfter(true);
                anim.setRepeatCount(Animation.INFINITE);
                ovalOne.startAnimation(anim);
                //ovalTwo.startAnimation(anim);

                RotateAnimation anim2 = new RotateAnimation(currentRotation, currentRotation + 1800,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                currentRotation = (currentRotation + 40) % 360;
                anim2.setInterpolator(new LinearInterpolator());
                anim2.setDuration(20000);
                anim2.setFillEnabled(true);
                anim2.setFillAfter(true);
                anim2.setRepeatCount(Animation.INFINITE);
                ovalTwo.startAnimation(anim2);
            }
        });
    }
}
