package com.example.hafizhamza.images;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
public void Next(View view)
{
    ImageView imageImageView=(ImageView)findViewById(R.id.iImageView);
    imageImageView.setImageResource(R.drawable.second);
}
    public void Previous(View view)
    {
        ImageView i=(ImageView)findViewById(R.id.iImageView);
                i.setImageResource(R.drawable.first);
      
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
