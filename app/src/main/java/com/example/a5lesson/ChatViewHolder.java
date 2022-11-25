package com.example.a5lesson;

import android.annotation.SuppressLint;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {

ImageView chatImageView;
TextView chatTitleView;
TextView chatdescription;
View chat_item;

    @SuppressLint("ResourceType")
    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        chatImageView = itemView.findViewById(R.id.imageView_iv);
        chatTitleView = itemView.findViewById(R.id.title_tv);
        chatdescription = itemView.findViewById(R.id.description_tv);
        chat_item = itemView.findViewById(R.layout.fragment_list);




    }
public void bind(int image, String title, String description) {
        chatImageView.setImageResource(image);
        chatTitleView.setText(title);
        chatdescription.setText(description);

}

}
