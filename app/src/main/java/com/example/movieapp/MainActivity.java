package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        //imageView = (ImageView) findViewById(R.id.imageView);

    }

    public void onButton1clicked(View v) {

        if(index == 0){

            index = 1;
        }else{

            Log.d("TAG","제대로 로딩완료");
            index = 0;
        }
    }



}