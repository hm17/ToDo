package com.hm.todo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addToDoItem(View view) {
        // Add ToDo item to list
        EditText editText = findViewById(R.id.editText3);
        String todo = editText.getText().toString();


        TextView textView = findViewById(R.id.textView);
        textView.setText(todo);
    }
}

