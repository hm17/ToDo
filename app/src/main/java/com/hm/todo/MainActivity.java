package com.hm.todo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a simple ToDo list that utilizes a ListView and ArrayAdapter.
 * You can dynamically add items to the ToDo list and also clear all items.
 * A toast message will appear if the user attempts to clear an empty list.
 *
 */
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

    /**
     * Add an item to the list
     * @param view
     */
    public void addToDoItem(View view) {
        // Get item from textbox
        EditText editText = findViewById(R.id.editText3);
        String todo = editText.getText().toString();

        // Add item to list and clear textbox
        todosList.add(todo);
        editText.setText("");
        arrayAdapter.notifyDataSetChanged();
    }

    /**
     * Delete all the items in the todo list
     *
     * @param view
     */
    public void clearAll(View view) {
        // Check if list is empty and alert user if it is
        if(todosList.isEmpty()) {
            Toast toast = Toast.makeText(getApplicationContext(), "The list is empty.", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            // Delete all items from the list and update
            todosList.clear();
            arrayAdapter.notifyDataSetChanged();
        }

    }

}

