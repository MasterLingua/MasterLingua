package com.example.masterlingua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView rep1,rep2,rep3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v) {
   rep1=(TextView)findViewById(R.id.rep1);
        Intent intent1 = new Intent(this, Error.class);
        startActivity(intent1);
      }


    public void onClick2(View v) {
        rep2=(TextView)findViewById(R.id.rep2);
        Intent intent2 = new Intent(MainActivity.this, Succes.class);
        startActivity(intent2);
    }


    public void onClick3(View v) {
        rep3=(TextView)findViewById(R.id.rep3);
        Intent intent3 = new Intent(this, Error.class);
        startActivity(intent3);
    }


    public void affichercarte(View v){
        Intent intent = new Intent(this, AfficherCarte.class);
        startActivity(intent);
    }


    }

