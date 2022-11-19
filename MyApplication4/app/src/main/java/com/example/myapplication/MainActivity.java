package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


        public void onClick(View view) {
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay();

    }
    public void lay()
    {
        findViewById(R.id.radioButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
        findViewById(R.id.radioButton2).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
        }
    });
    }
}
