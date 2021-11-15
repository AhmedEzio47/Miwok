package com.devyat.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.devyat.miwok.adapters.WordsAdapter;
import com.devyat.miwok.models.Word;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        populateColors();
    }

    private  void populateColors(){
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Green", "chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("Black", "kululli", R.drawable.color_black));
        words.add(new Word("White", "kelelli", R.drawable.color_white));

        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        GridView gridView = findViewById(R.id.colors_grid);

        gridView.setAdapter(itemsAdapter);
    }
}