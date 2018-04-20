package com.example.rodjeep.goodhealthgoodlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageButton imb2=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton imb3=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton imb4=(ImageButton)findViewById(R.id.imageButton4);
        ImageButton imb5=(ImageButton)findViewById(R.id.imageButton5);
        imb2.setOnClickListener(this);
        imb3.setOnClickListener(this);
        imb4.setOnClickListener(this);
        imb5.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case(R.id.imageButton2):
                Intent itn2 = new Intent(this,BMI.class);
                startActivity(itn2);
                break;
            case(R.id.imageButton3):
                Intent itn3 = new Intent(this,cal.class);
                startActivity(itn3);
                break;
            case(R.id.imageButton4):
                Intent itn4 = new Intent(this,tablemass.class);
                startActivity(itn4);
                break;
            case(R.id.imageButton5):
                Intent itn5 = new Intent(this,News.class);
                startActivity(itn5);
                break;
        }
    }

}
