package com.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Timer timerTask;

    //Создаем первое активити
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart(){
        super.onStart();
        timerTask = new Timer();
        timerTask.execute(this);
    }

    protected void Die(){
        Intent intent = new Intent(this, ActivityList.class);
        startActivity(intent);
        finish();
    }
    
}

