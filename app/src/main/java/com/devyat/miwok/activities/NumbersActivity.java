package com.devyat.miwok.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.devyat.miwok.R;
import com.devyat.miwok.adapters.WordsAdapter;
import com.devyat.miwok.models.Word;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        populateNumbers();
    }
    private WordsAdapter itemsAdapter;
    private  void populateNumbers(){
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));

        itemsAdapter = new WordsAdapter(this, words);

        ListView listView = findViewById(R.id.numbers_list);

        listView.setAdapter(itemsAdapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        itemsAdapter.releaseAudioPlayer();
    }
}