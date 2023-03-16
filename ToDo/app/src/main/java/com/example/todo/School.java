package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class School extends AppCompatActivity {

    // create necessary items
    Button buttonAdd;
    EditText addText;
    ListView listView;
    ArrayList<String> toDoList;
    ArrayAdapter adapter;

    @Override
    // auto-generated method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        // link necessary items with items in xml file
        buttonAdd = findViewById(R.id.buttonAdd);
        addText = findViewById(R.id.addText);
        listView = findViewById(R.id.listView);
        toDoList = new ArrayList<>();
    }

    // onClick method for adding item to toDoList
    public void onAdd(View view){
        // store user input as String
        String text = addText.getText().toString();

        // update list only if the input is field is not blank
        if(!text.equals("")){
            toDoList.add(text);
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, toDoList);
            listView.setAdapter(adapter);
            // clear text after task is added
            addText.setText("");
        }
    }

    // onClick method for clearing toDoList
    public void onClear(View view){
        adapter.clear();
    }

    public void onBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}