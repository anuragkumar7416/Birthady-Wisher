package com.anuragkumar.birthdaywisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "Username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createBirthdayCard(View view) {
        EditText editText = findViewById(R.id.InputBox);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, BirthdayGreeting.class);
        intent.putExtra(EXTRA_MESSAGE, name);
        startActivity(intent);
        Toast.makeText(this, "Your name is " + name, Toast.LENGTH_SHORT).show();


    }
}