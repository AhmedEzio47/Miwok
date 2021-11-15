package com.devyat.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

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

    private  void populateNumbers(){
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));

        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        ListView listView = findViewById(R.id.numbers_list);

        listView.setAdapter(itemsAdapter);
    }
}