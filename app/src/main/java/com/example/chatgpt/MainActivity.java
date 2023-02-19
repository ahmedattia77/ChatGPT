package com.example.chatgpt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextView helloText;
    private EditText massage;
    private ImageButton send;
    List<Message> ListOfMessages;
    ContentAdapter contentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycleView_rv);
        helloText = findViewById(R.id.main_welcomeText_tv);
        massage = findViewById(R.id.main_chat_et);
        send = findViewById(R.id.main_send_iv);

        ListOfMessages = new ArrayList<>();
        contentAdapter = new ContentAdapter(ListOfMessages);
        recyclerView.setAdapter(contentAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        send.setOnClickListener(v -> {
            String content = massage.getText().toString().trim();
            Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
        });


    }
}