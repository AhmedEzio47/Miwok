package com.devyat.miwok.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.devyat.miwok.R;
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
    private WordsAdapter itemsAdapter;
    private  void populatePhrases(){
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));

        itemsAdapter = new WordsAdapter(this, words);

        ListView listView = findViewById(R.id.phrases_list);

        listView.setAdapter(itemsAdapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        itemsAdapter.releaseAudioPlayer();
    }
}