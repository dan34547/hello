package com.example.rodjeep.goodhealthgoodlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imb1=(ImageButton)findViewById(R.id.imageButton);
        imb1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent itn = new Intent(this,Home.class);
        startActivity(itn);
    }
}
