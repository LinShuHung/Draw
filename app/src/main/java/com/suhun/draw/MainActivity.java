package com.suhun.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSignFun(View view){
        Intent intent = new Intent(this, SignActivity.class);
        startActivity(intent);
    }

    public void goCircleFun(View view){
        Intent intent = new Intent(this, CircleActivity.class);
        startActivity(intent);
    }
}