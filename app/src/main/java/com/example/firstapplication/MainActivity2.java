package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView accountdetails;
private TextView name;
private TextView surname;
private TextView mail;
private TextView usergender;
private TextView userpronouns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        accountdetails=findViewById(R.id.response);
        name=findViewById(R.id.Name);
        surname=findViewById(R.id.surname);
        mail=findViewById(R.id.mail);
        usergender=findViewById(R.id.usergender);
        userpronouns=findViewById(R.id.userpronouns);
        String username=getIntent().getStringExtra("keyname");
        String usersurname=getIntent().getStringExtra("keyname_one");
        String usermail=getIntent().getStringExtra("keyname_two");
        String user_gender=getIntent().getStringExtra("keyname_three");
        String user_pronouns=getIntent().getStringExtra("keyname_four");
        name.setText(username);
        surname.setText(usersurname);
        mail.setText(usermail);
        usergender.setText(user_gender);
        userpronouns.setText(user_pronouns);
    }
}