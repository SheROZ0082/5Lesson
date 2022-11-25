package com.example.a5lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewInterface {
private ArrayList chats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chats = new ArrayList<>();
        getSupportFragmentManager().beginTransaction().add(R.id.FragmentContainer, new ListFragment()).commit();
    }

    @Override
    public void onItemClick(int position) {

    }
}