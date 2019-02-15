package com.example.android.messages;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<Message> list = generateEmailList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView messageRecycler = findViewById(R.id.messages_recycler_view);
        messageRecycler.setLayoutManager(new LinearLayoutManager(this));
        MessageAdapter messageAdapter = new MessageAdapter(this, list);
        messageRecycler.setAdapter(messageAdapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }

    private List<Message> generateEmailList() {
        List<Message> list = new ArrayList<>();
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Leo", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Nadya", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Dad", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your test", "12:00"));
        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab: {
                Intent intent = new Intent(this, WriteActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}

