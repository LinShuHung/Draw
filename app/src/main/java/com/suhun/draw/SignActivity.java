package com.suhun.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class SignActivity extends AppCompatActivity {
    private SignView signView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        initView();
    }
    private void initView(){
        signView = findViewById(R.id.lid_sign_view);
    }

    public void undoFun(View view){
        signView.undo();
    }

    public void finishFun(View view){
        finish();
    }
}