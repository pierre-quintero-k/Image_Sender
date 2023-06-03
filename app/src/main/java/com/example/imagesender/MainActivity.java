package com.example.imagesender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image_1, image_2, image_3, image_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_1 = findViewById(R.id.image1);
        image_2 = findViewById(R.id.image2);
        image_3 = findViewById(R.id.image3);
        image_4 = findViewById(R.id.image4);


    }

    public void onClicker(View v) {
        int imageId = 0;

        switch (v.getId()) {
            case R.id.image1:
                imageId = R.drawable.flat1;
                break;
            case R.id.image2:
                imageId = R.drawable.flat33;
                break;
            case R.id.image3:
                imageId = R.drawable.flat44;
                break;
            case R.id.image4:
                imageId = R.drawable.flat66;
                break;
        }

        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("imageId", imageId);
        startActivity(intent);
    }
}