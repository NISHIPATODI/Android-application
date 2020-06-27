package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button button_Login;
    EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed2= (EditText)findViewById(R.id.editText2);
        ed1= (EditText)findViewById(R.id.editText);

        button_Login= (Button)findViewById(R.id.button3);
        button_Login.setOnClickListener(
                  new View.OnClickListener(){

                    @Override
                    public void onClick(View v)
                    {
                        if(ed1.getText().toString().equals("admin") &&
                                ed2.getText().toString().equals("admin")){
                            Intent intent = new Intent(".content");
                            startActivity(intent);

                        }

                       else{
 Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                        }
                    }
                }
        );
    }
}
