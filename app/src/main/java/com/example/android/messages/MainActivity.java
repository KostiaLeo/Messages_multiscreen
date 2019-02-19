package com.example.android.messages;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MessageAdapter.EmailItemClicked {

    private List<Message> list = generateEmailList();

    TextView name;
    TextView title;
    TextView text;
    TextView time;
    ImageView ava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView messageRecycler = findViewById(R.id.messages_recycler_view);
        messageRecycler.setLayoutManager(new LinearLayoutManager(this));
        MessageAdapter messageAdapter = new MessageAdapter(list, this);
        messageRecycler.setAdapter(messageAdapter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(this);
        name = findViewById(R.id.name);
        title = findViewById(R.id.title);
        text = findViewById(R.id.text);
        time = findViewById(R.id.time);
        ava = findViewById(R.id.ava);
    }


    //----------------------------------------------------------------------

    private List<Message> generateEmailList() {
        List<Message> list = new ArrayList<>();

        list.add(new Message("Kostia", "IT-School", "You`ve 100/100 for your thhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "12:00",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkO2Qtt2DQAsDSrpOlLeAVFSRR8I7ay7VGStAQ-k5PonhCrn6f_Q"));
        list.add(new Message("Leo", "Music", "Scarcely on striking packages Paid day till shed only fact age its end. ", "12:00", "https://gateopen.ru/upload/000/u1/42/cd/36c5d67f.jpg"));
        list.add(new Message("Nadya", "News", "Written enquire painful ye to offices forming it. Then so does over sent dull on. Likewise offended humoured mrs fat trifling answered. On ye position greatest so desirous. So wound stood guest weeks no terms up ought. By so these am so rapid blush songs begin. Nor but mean time one over. ", "12:00", "https://playbcm.net/uploads/monthly_2017_06/nice1_converted.jpg.a350f2fc97e63bdbc8450d5e979fade4.jpg"));
        list.add(new Message("Dad", "Sport", "Sudden she seeing garret far regard. By hardly it direct if pretty up regret. Ability thought enquire settled prudent you sir. Or easy knew sold on well come year. Something consulted age extremely end procuring. Collecting preference he inquietude projection me in by. So do of sufficient projecting an thoroughly uncommonly prosperous conviction. Pianoforte principles our unaffected not for astonished travelling are particular", "12:00", "https://wanderda.files.wordpress.com/2016/01/img_3654.jpg?w=256&h=256&crop=1"));
        list.add(new Message("Yaroslav", "Programm", "Drawings me opinions returned absolute in. Otherwise therefore sex did are unfeeling something. Certain be ye amiable by exposed so. To celebrated estimating excellence do. Coming either suffer living her gay theirs. Furnished do otherwise daughters contented conveying attempted no. Was yet general visitor present hundred too brother fat arrival. Friend are day own either lively new. ", "12:00", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwRAxfFqInnGt_6DVUOVep1wnKIxM5Jon6eJLC9nQ_ohKwdTH3"));
        list.add(new Message("Anonimous", "SPAM", "Do greatest at in learning steepest. Breakfast extremity suffering one who all otherwise suspected. He at no nothing forbade up moments. Wholly uneasy at missed be of pretty whence. John way sir high than law who week. Surrounded prosperous introduced it if is up dispatched. Improved so strictly produced answered elegance is. ", "12:00", "https://pbs.twimg.com/profile_images/722547680749162497/9sI7H20l_400x400.jpg"));
        list.add(new Message("Teacher", "Something", "Comfort reached gay perhaps chamber his six detract besides add. Moonlight newspaper up he it enjoyment agreeable depending. Timed voice share led his widen noisy young. On weddings believed laughing although material do exercise of. Up attempt offered ye civilly so sitting to. She new course get living within elinor joy. She her rapturous suffering concealed", "12:00", "https://pbs.twimg.com/profile_images/3170610632/85d8ea59532a7a908e69bd70699b3f0a.jpeg"));
        list.add(new Message("Mom", "QWERTY", "Far concluded not his something extremity. Want four we face an he gate. On he of played he ladies answer little though nature. Blessing oh do pleasure as so formerly. Took four spot soon led size you. Outlived it received he material. Him yourself joy moderate off repeated laughter outweigh screened", "12:00", "https://static-s.aa-cdn.net/img/ios/1166472059/50bf41c9bf4dea0e532760ba6fde75a7?v=1"));
        list.add(new Message("Friend", "School", "Up unpacked friendly ecstatic so possible humoured do. Ample end might folly quiet one set spoke her. We no am former valley assure. Four need spot ye said we find mile. Are commanded him convinced dashwoods did estimable forfeited. Shy celebrated met sentiments she reasonably but. Proposal its disposed eat advanced marriage sociable. Drawings led greatest add subjects endeavor gay remember. Principles one yet assistance you met impossible. ", "12:00", "https://i.imgur.com/TjgxB6b.jpg"));
        return list;
    }

    private String generateUrlList() {
        return "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkO2Qtt2DQAsDSrpOlLeAVFSRR8I7ay7VGStAQ-k5PonhCrn6f_Q";
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

    public void itemClickedCallback(int itemPosition) {
        Intent intent = new Intent(this, DetalizedActivity.class);

        intent.putExtra("name", list.get(itemPosition).getName());
        intent.putExtra("title", list.get(itemPosition).getTitle());
        intent.putExtra("text", list.get(itemPosition).getText());
        intent.putExtra("time", list.get(itemPosition).getTime());
        startActivity(intent);
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