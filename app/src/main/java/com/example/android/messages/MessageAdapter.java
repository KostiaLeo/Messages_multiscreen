package com.example.android.messages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>  {
    private List<Message> messageList;
    private EmailItemClicked callback;
    private List<String> myUrls;
    //---------------------------------------------------------------------------------------

    MessageAdapter(List<Message> messages, EmailItemClicked callback, List<String> myUrls) {
        this.messageList = messages;
        this.callback = callback;
        this.myUrls = myUrls;
    }

    @NonNull
    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPosition = holder.getAdapterPosition();
                if (adapterPosition != RecyclerView.NO_POSITION && callback != null) {
                    callback.itemClickedCallback(adapterPosition);
                }
            }
        });
        return holder;
    }

//-------------------------------------------------------------------------------------------------------------

    @Override
    public int getItemCount() {
        if (messageList == null) {
            return 0;
        }
        return messageList.size();
    }

//------------------------------------------------------------------------------------------------------------

    @Override
    public void onBindViewHolder(MessageAdapter.ViewHolder holder, int position) {
        Message message = messageList.get(position);
        holder.nameTv.setText(message.getName());
        holder.titleTv.setText(message.getTitle());
        holder.textTv.setText(message.getText());
        holder.timeTv.setText(message.getTime());

        ImageView ava = (holder).ava;
        String currentUrl = myUrls.get(position);
        Glide.with(ava)
                .load(currentUrl)
                .into(ava);

    }

    //----------------------------------------------------------------------------------------------------

    interface EmailItemClicked {
        void itemClickedCallback(int itemPosition);
    }

    //------------------------------------------------------------------------------------------------------

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv, titleTv, textTv, timeTv;
        ImageView ava;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.name);
            titleTv = itemView.findViewById(R.id.title);
            textTv = itemView.findViewById(R.id.text);
            timeTv = itemView.findViewById(R.id.time);
            ava = itemView.findViewById(R.id.ava);
        }
    }
}


