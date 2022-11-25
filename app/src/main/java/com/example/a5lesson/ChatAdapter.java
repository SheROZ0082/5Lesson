package com.example.a5lesson;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter<ItemClickListener> extends RecyclerView.Adapter<ChatViewHolder> {
    private RecycleViewInterface recycleViewInterface;
    private ArrayList<ChatModel> chats;
    private ItemClickListener;


    public ChatAdapter(ArrayList<ChatModel> chats) {
        this.chats = chats;
        this.

    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {

        holder.bind(chats.get(position).image, chats.get(position).title, chats.get(position).chatDescription);
        holder.chat_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recycleViewInterface.onItemClick(Integer.parseInt());
            }
        });
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }




    }

