package com.example.rollingdice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView message;
    Button btn;
    ImageView dice;
   

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice = (ImageView) findViewById(R.id.dice);
        message = findViewById(R.id.message);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                rollDice();
            }


            void rollDice() {


                int randomInt = new Random().nextInt(6)+1;
                message.setText(String.valueOf(randomInt));

               if (randomInt==1){
                  dice.setImageResource(R.drawable.dice_1);
               }
               else if (randomInt==2){
                   dice.setImageResource(R.drawable.dice_2);
               }
               else if (randomInt==3){
                   dice.setImageResource(R.drawable.dice_3);
               }
               else if (randomInt==4) {
                   dice.setImageResource(R.drawable.dice_4);
               }
               else if (randomInt==5) {
                   dice.setImageResource(R.drawable.dice_5);
               }
               else{
                   dice.setImageResource(R.drawable.dice_6);
               }


            }
        });
    }
}
