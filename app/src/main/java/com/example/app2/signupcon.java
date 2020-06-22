package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signupcon extends AppCompatActivity {
    Button button_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupcon);
                button_signup= (Button)findViewById(R.id.button5);
        button_signup.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent= new Intent("com.example.app2.Main2Activity");
                        startActivity(intent);
                    }
                }
        );
    }
}
