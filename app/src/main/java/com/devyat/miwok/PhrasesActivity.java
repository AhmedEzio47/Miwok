package com.devyat.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.devyat.miwok.adapters.WordsAdapter;
import com.devyat.miwok.models.Word;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        populatePhrases();
    }

    private  void populatePhrases(){
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));

        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        GridView gridView = findViewById(R.id.phrases_grid);

        gridView.setAdapter(itemsAdapter);
    }
}