package com.example.android.messages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>  {
    private LayoutInflater inflater;
    private List<Message> messageList;

    MessageAdapter(Context context, List<Message> messages) {
        this.messageList = messages;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        if (messageList == null) return 0;
        return messageList.size();
    }

    @Override
    public void onBindViewHolder(MessageAdapter.ViewHolder holder, int position) {
        Message message = messageList.get(position);
        holder.nameTv.setText(message.getName());
        holder.titleTv.setText(message.getTitle());
        holder.textTv.setText(message.getText());
        holder.timeTv.setText(message.getTime());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv, titleTv, textTv, timeTv;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.name);
            titleTv = itemView.findViewById(R.id.title);
            textTv = itemView.findViewById(R.id.text);
            timeTv = itemView.findViewById(R.id.time);
        }
    }


}


