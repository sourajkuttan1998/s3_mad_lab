package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.net.InterfaceAddress;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "oncreate called", Toast.LENGTH_SHORT).show();

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
               }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onstart called", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"onstart called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onrestart called", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"onrestart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onpause called", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"onpause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onstop called",Toast.LENGTH_SHORT).show();
        Log.e(TAG,"onstop called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onresume called",Toast.LENGTH_SHORT).show();
        Log.e(TAG,"onresume called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"ondestroy called",Toast.LENGTH_SHORT).show();
        Log.e(TAG,"ondestroy called");
    }
}