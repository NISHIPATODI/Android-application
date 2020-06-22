package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button button_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_content= (Button)findViewById(R.id.button3);
        button_content.setOnClickListener(
                  new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent= new Intent(".content");
                        startActivity(intent);
                    }
                }
        );
    }
}
