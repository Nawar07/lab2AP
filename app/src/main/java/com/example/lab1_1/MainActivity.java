package com.example.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private int r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giveNewRandom();
    }

    private void giveNewRandom(){
        Random rand = new Random();
        r1 = rand.nextInt(10);
        while(true) {
            r2 = rand.nextInt(10);
            if(r1 != r2)break;
        }

        Button b = (Button) findViewById(R.id.buttonL);
        b.setText(Integer.toString(r1));
        Button b2 = (Button) findViewById(R.id.buttonR);
        b2.setText(Integer.toString(r2));
    }

    public void onClickLeft(View view){
        if(r1 > r2)
            count++;
        else
            count--;

        TextView text = (TextView) findViewById(R.id.Result);
        text.setText("Points: "+count);
        giveNewRandom();
    }

    public void onClickRight(View view){
        if(r1 < r2)
            count++;
        else
            count--;

        TextView text = (TextView) findViewById(R.id.Result);
        text.setText("Points: "+count);
        giveNewRandom();
    }

}