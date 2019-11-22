package com.example.hafizhamza.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView id=(ImageView)findViewById(R.id.iImageView);
        id.setImageResource(R.drawable.second);
    }
}
