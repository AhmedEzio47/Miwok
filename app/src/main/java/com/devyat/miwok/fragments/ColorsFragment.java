package com.devyat.miwok.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.devyat.miwok.R;
import com.devyat.miwok.adapters.WordsAdapter;
import com.devyat.miwok.models.Word;

import java.util.ArrayList;

public class ColorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_colors, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateColors();
    }

    WordsAdapter itemsAdapter;

    private  void populateColors(){
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("Green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("Brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("Black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("White", "kelelli", R.drawable.color_white, R.raw.color_white));

        itemsAdapter = new WordsAdapter(getActivity(), words);

        ListView listView = getView().findViewById(R.id.colors_list);

        listView.setAdapter(itemsAdapter);
    }

    @Override
    public void onPause() {
        super.onPause();
        itemsAdapter.releaseAudioPlayer();
    }
    @NonNull
    @Override
    public String toString() {
        return "Colors";
    }
}