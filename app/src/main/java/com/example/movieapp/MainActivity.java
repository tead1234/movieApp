package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 객체 생성은 여기서
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onButton1clicked(View v) {

        if(index == 0){
            imageView2.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
            index = 1;
        }else if(index == 1){
            imageView2.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            index = 0;
        }
    }



}