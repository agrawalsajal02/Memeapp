package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    private Button mButton,memebutton;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.createBirthdaybutton);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
               EditText et=findViewById(R.id.nameInput);
//
//                Toast t=Toast.makeText(MainActivity.this,et.getText().toString(), Toast.LENGTH_LONG);
//                t.show();
////                /this,"button was clicked", Toast.LENGTH_LONG

             Intent intent=new Intent(getApplicationContext(),BirthdayGreetingActivity.class);
             intent.putExtra("name",et.getText().toString());
             startActivity(intent);

            }
        });
        memebutton=findViewById(R.id.membutton);
        memebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),MemeApp.class);
                startActivity(intent);

            }
        });



    }


}