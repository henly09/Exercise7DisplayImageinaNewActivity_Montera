package com.hcdc.exercise7displayimageinanewactivity_montera;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView rviewmain;
    String names[] = new String[] {"Helping Shrek", "Harry Shrek", "Shraq Shrek", "Donkrek", "Chad Shrek"};
    String define[] = new String[] {"You've got a friend in me\n" +
            "You've got a friend in me\n" +
            "When the road looks rough ahead\n" +
            "And you're miles and miles\n" +
            "From your nice warm bed\n" +
            "You just remember what your old pal said\n" +
            "Boy, you've got a friend in me\n" +
            "Yeah, you've got a friend in me",
            "Expecto Patronum. This is undoubtedly the most " +
                    "popular spell in the film series.\n" +
            "Confundo. The perfect spell for messing with people, " +
                    "this charm confuses a person or bewitches an " +
                    "object, like a broom. ...",
            "Yo Big Shraq, the one and only Man's not hot, " +
                    "never hot Skrrat (GottiOnEm), " +
                    "skidi-kat-kat Boom",
            "The donkey in the movie Shrek, so aptly named 'Donkey,' " +
                    "is one of the most beloved computer-animated " +
                    "sidekicks of all of time. He is known for his " +
                    "hyperactive (and sometimes annoying but always " +
                    "endearing) demeanor, his idle chatter, and of " +
                    "course, his all-consuming love of waffles.",
            "Chad is a usually disparaging internet slang term used for " +
                    "a popular, confident, sexually active young white " +
                    "male. Its female counterpart is Stacy, " +
                    "who is often portrayed as Chad's sexual partner. " +
                    "Use of Chad is associated with the incel community " +
                    "and the website 4chan to refer stereotypical alpha males."};

    int[] imgIds = new int[] {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Shrek Multiverse");

        rviewmain = findViewById(R.id.rview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());

        rviewmain.setLayoutManager(layoutManager);

        rviewmain.setAdapter(new ImageAdapter(this, names, imgIds, define));








    }
}