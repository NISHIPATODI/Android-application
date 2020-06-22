package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
Button button_nxt,button_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       onClickButtonListener();
    }
    public void onClickButtonListener(){
        button_nxt= (Button)findViewById(R.id.button);
        button_nxt.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent= new Intent("com.example.app2.Main2Activity");
                        startActivity(intent);
                    }
                }
        );
        button_signup= (Button)findViewById(R.id.button2);
        button_signup.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent= new Intent(".signup2");
                        startActivity(intent);
                    }
                }
        );
    }

}
