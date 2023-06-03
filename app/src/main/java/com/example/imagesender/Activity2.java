package com.example.imagesender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
    private ImageView imageView;
    private Button backButton, closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        imageView= findViewById(R.id.image_view);
        backButton= findViewById(R.id.backButton);
        closeButton=findViewById(R.id.closeButton);

        int imageId = getIntent().getIntExtra("imageId", 0);
        imageView.setImageResource(imageId);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finishAffinity();
            }
        });
    }
}