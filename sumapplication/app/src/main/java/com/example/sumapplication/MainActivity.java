package com.example.sumapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView3);
        e1=findViewById(R.id.editTextNumber);

        findViewById(R.id.button).setOnClickListener(view -> {
            if (TextUtils.isEmpty(e1.getText().toString())){
                Toast.makeText(getApplicationContext(),"EmptyString", Toast.LENGTH_SHORT).show();
                e1.setText("Enter result");
            }
            else{
                if((Integer.parseInt(t1.getText().toString())+Integer.parseInt(t2.getText().toString()))==(Integer.parseInt(e1.getText().toString()))){
                  Toast.makeText(getApplicationContext(),"pass",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"fail",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}