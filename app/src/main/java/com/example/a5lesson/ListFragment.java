package com.example.a5lesson;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    RecyclerView chatsRecycleView;
    ChatAdapter chatAdapter;
    private ArrayList<ChatModel>chats;
ExtendedFloatingActionButton addButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        chatsRecycleView = view.findViewById(R.id.chat_recycleView);
        chats = new ArrayList<>();
addButton = view.findViewById(R.id.add_btn);
        setChats();
        chatsRecycleView.setAdapter(chatAdapter = new ChatAdapter(chats));

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chats.add(0,new ChatModel(R.drawable.sunrise,"New chat", "hello"));
                chatAdapter.notifyDataSetChanged();
            }
        });
    }

    private void setChats(){
        chats.add(new ChatModel(R.drawable.sunrise , "sunrise", "this is Sun"));
        chats.add(new ChatModel(R.drawable.doctors , "doctor", "this is doctor"));
        chats.add(new ChatModel(R.drawable.samurai, "samurai", "this is samurai"));
        chats.add(new ChatModel(R.drawable.cross, "cross", "this is cross"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
        chats.add(new ChatModel(R.drawable.injure, "injure", "this is injure"));
    }
}