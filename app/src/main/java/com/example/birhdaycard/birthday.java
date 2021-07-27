package com.example.birhdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class birthday extends AppCompatActivity{
    TextView mTextview;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        mTextview=(TextView)findViewById(R.id.text);
        String value=getIntent().getStringExtra("birthdayname");
         Log.d("Name",value);
         mTextview.setText("Happy Birthday\n"+value);
    }
}