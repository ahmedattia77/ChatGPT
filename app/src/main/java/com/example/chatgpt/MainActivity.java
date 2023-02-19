package com.example.chatgpt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextView helloText;
    private EditText massage;
    private ImageButton send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycleView_rv);
        helloText = findViewById(R.id.main_welcomeText_tv);
        massage = findViewById(R.id.main_chat_et);
        send = findViewById(R.id.main_send_iv);

        send.setOnClickListener(v -> {
            String content = massage.getText().toString().trim();
            Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
        });


    }
}