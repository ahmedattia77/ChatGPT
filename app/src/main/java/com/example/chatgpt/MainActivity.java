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
    private EditText message;
    private ImageButton send;
    List<Message> ListOfMessages;
    ContentAdapter contentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycleView_rv);
        helloText = findViewById(R.id.main_welcomeText_tv);
        message = findViewById(R.id.main_chat_et);
        send = findViewById(R.id.main_send_iv);

        ListOfMessages = new ArrayList<>();
        contentAdapter = new ContentAdapter(ListOfMessages);
        recyclerView.setAdapter(contentAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        send.setOnClickListener(v -> {
            String content = message.getText().toString().trim();
            senMessage(content , Message.SENT_BY_ME);
            message.setText("");
            helloText.setVisibility(View.GONE);
        });


    }
    public void senMessage (String message , String sendBy){
        ListOfMessages.add(new Message(message , sendBy));
        contentAdapter.notifyDataSetChanged();
        recyclerView.smoothScrollToPosition(contentAdapter.getItemCount());
    }
}