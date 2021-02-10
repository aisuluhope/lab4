package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button);
        ImageButton imageButton1 = findViewById(R.id.imageButton);

        button1.setOnClickListener(this);
        imageButton1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                TextView lastName = (TextView)
                        findViewById(R.id.button);
                lastName.setText("Abdraimova");
                Toast myToast = Toast.makeText(getApplicationContext(), "My last name!", Toast.LENGTH_LONG);
                myToast.show();
                Handler handleToast = new Handler();
                handleToast.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast mySecondToast = Toast.makeText(getApplicationContext(), "I changed my name!", Toast.LENGTH_LONG);
                        mySecondToast.show();
                    }
                }, 3000);
                ;
                break;
            case R.id.imageButton:
                ImageButton imageButton = (ImageButton)
                findViewById(R.id.imageButton);
                TextView firstName = (TextView)
                        findViewById(R.id.button);
                firstName.setText("Aisulu");
                Toast myThirdToast = Toast.makeText(getApplicationContext(), "My first name!", Toast.LENGTH_SHORT);
                myThirdToast.show();
                imageButton.setBackgroundColor(Color.BLACK);
                break;

        }
    }
}