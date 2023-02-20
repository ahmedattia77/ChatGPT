package com.example.chatgpt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyViewHolder>{
    List<Message>messages;
    public ContentAdapter(List<Message>messages) {
        this.messages = messages;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ContentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.eatch_item , null);
        MyViewHolder myViewHolder = new MyViewHolder(ContentView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Message message = messages.get(position);
        if (message.getSentBy().equals(message.SENT_BY_BOT)){
            holder.leftLayout.setVisibility(View.GONE);
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.rightTextContent.setText(message.getContent());
        }else{
            holder.rightLayout.setVisibility(View.GONE);
            holder.leftLayout.setVisibility(View.VISIBLE);
            holder.leftTextContent.setText(message.getContent());
        }
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftTextContent;
        TextView rightTextContent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            leftLayout = itemView.findViewById(R.id.eachItem_left_chatText_lo);
            rightLayout = itemView.findViewById(R.id.eachItem_right_chatText_lo);
            leftTextContent = itemView.findViewById(R.id.eachItem_left_chatText_tv);
            rightTextContent = itemView.findViewById(R.id.eachItem_right_chatText_tv);
        }
    }
}
