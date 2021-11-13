package com.devyat.miwok.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.devyat.miwok.R;
import com.devyat.miwok.models.Word;

import java.util.ArrayList;
import java.util.List;

public class WordsAdapter extends ArrayAdapter<Word> {
    public WordsAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.number_item, parent, false);
        }
        TextView defaultTV = listItemView.findViewById(R.id.english_number);
        TextView miwokTV = listItemView.findViewById(R.id.miwok_number);
        defaultTV.setText(getItem(position).getDefaultTranslation());
        miwokTV.setText(getItem(position).getMiwokTranslation());
        return listItemView;
    }
}
