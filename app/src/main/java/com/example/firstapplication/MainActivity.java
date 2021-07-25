package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
private TextView beginning;
private TextInputEditText first_name;
private TextInputEditText last_name;
private TextInputEditText email_address;
private TextInputEditText gender;
private TextInputEditText preferred_pronouns;
private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        beginning= findViewById(R.id.beginning);
        first_name= findViewById(R.id.Firstrow);
        last_name= findViewById(R.id.Secondrow);
        email_address= findViewById(R.id.Thirdrow);
        gender= findViewById(R.id.Fourthrow);
        preferred_pronouns= findViewById(R.id.Fifthrow);
        submit= findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= first_name.getText().toString();
                String user_surname= last_name.getText().toString();
                String user_email_address= email_address.getText().toString();
                String user_gender= gender.getText().toString();
                String user_preferred_pronoun= preferred_pronouns.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keyname", username);
                intent.putExtra("keyname_one", user_surname);
                intent.putExtra("keyname_two", user_email_address);
                intent.putExtra("keyname_three", user_gender);
                intent.putExtra("keyname_four", user_preferred_pronoun);
                startActivity(intent);
            }
        });
    }
}