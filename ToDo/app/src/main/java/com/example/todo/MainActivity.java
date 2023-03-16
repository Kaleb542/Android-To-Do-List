package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPersonal(View view){
        Intent intent = new Intent(this,ToDo.class);
        startActivity(intent);
    }

    public void onSchool(View view) {
        Intent intent = new Intent(this, School.class);
        startActivity(intent);
    }

    public void onOther(View view){
        Intent intent = new Intent(this, Other.class);
        startActivity(intent);
    }

    public void onHelp(View view){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }


}