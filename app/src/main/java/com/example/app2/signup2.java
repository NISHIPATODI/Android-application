package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup2 extends AppCompatActivity {
    Button button_next;
    EditText schl ,father, stud,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        button_next= (Button)findViewById(R.id.button4);
        schl= (EditText)findViewById(R.id.editText3);
        father= (EditText)findViewById(R.id.editText4);
        stud= (EditText)findViewById(R.id.editText7);
        city= (EditText)findViewById(R.id.editText8);

        button_next.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        if (schl.getText().toString().trim().isEmpty() ||
                                father.getText().toString().trim().isEmpty() ||
                                stud.getText().toString().trim().isEmpty()||
                               city.getText().toString().trim().isEmpty())
                        {
                            Toast.makeText(getApplicationContext(), "Fill all required info",Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Intent intent = new Intent(".signupcon");
                            startActivity(intent);
                        }
                    }
                }
        );
    }
}
