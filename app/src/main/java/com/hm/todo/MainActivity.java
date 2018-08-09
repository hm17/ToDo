package com.hm.todo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;

    List<String> todosList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lv = (ListView) findViewById(R.id.lv);
        final Button btn = (Button) findViewById(R.id.btn);

        // Create Array Adapter
        arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, todosList);

        lv.setAdapter(arrayAdapter);
    }

    public void addToDoItem(View view) {
        // Add ToDo item to list
        EditText editText = findViewById(R.id.editText3);
        String todo = editText.getText().toString();

        todosList.add(todo);

        editText.setText("");
        arrayAdapter.notifyDataSetChanged();

    }
}

