package com.example.android.messages;


public class Message {
    public String name, title, text, time, link;

    public Message(String name, String title, String text, String time, String link) {
        this.name = name;
        this.title = title;
        this.text = text;
        this.time = time;
        this.link = link;
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
}

