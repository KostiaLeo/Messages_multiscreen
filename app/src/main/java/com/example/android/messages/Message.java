package com.example.android.messages;


import android.media.Image;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Message {
    public String name, title, text, time, link;
    public ImageView ava;
    public Message(String name, String title, String text, String time) {
        this.name = name;
        this.title = title;
        this.text = text;
        this.time = time;
     //   this.link = link;
      //  this.ava = ava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

  //  public ImageView getAva() {
    //    Glide.with(ava).load(link).into(ava);
      //  return ava;
    //}
    //public void setAva() {
     //   Glide.with(ava).load(link).into(this.ava);
    //}
}

