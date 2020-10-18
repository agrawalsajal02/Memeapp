package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        Bundle extras=getIntent().getExtras();
        String name=extras.getString("name");

        Toast.makeText(getApplicationContext(),"Happy birthday \n"+ name,Toast.LENGTH_LONG).show();

        TextView greet=(TextView) findViewById(R.id.birthdaygreeting);
        greet.setText(greet.getText()+"\n"+name);


    }
}