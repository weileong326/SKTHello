package com.example.taruc.week1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg;//a module level variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = create()Function
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMsg = findViewById(R.id.textViewMessage);
    }
    //Viev = class
//v = an instance of a class
    public void showMessage(View v){
        //Linking UI to program
        textViewMsg.setText("Hello, world!!!");

    }

    public void clearScreen(View v) {
        textViewMsg.setText("");
    }
}

