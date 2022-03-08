package com.hcdc.exercise7displayimageinanewactivity_montera;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class secpage extends AppCompatActivity {

    TextView textmain,defineview;
    ImageView imagemain;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secpage);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Shrek Multiverse Second Page");

        textmain = findViewById(R.id.textView3);
        defineview = findViewById(R.id.textView4);
        imagemain = findViewById(R.id.imageView2);
        Intent intent = getIntent();
        textmain.setText(intent.getStringExtra("name"));
        defineview.setText(intent.getStringExtra("define"));
        imagemain.setImageResource(intent.getIntExtra("image", 0));


    }
}
