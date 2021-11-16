package com.devyat.miwok.adapters;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.devyat.miwok.R;
import com.devyat.miwok.helpers.AudioPlayer;
import com.devyat.miwok.models.Word;

import java.util.List;

import static android.view.View.*;

public class WordsAdapter extends ArrayAdapter<Word> {
    private AudioPlayer audioPlayer;
    Context context;

    public WordsAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_item, parent, false);
        }
        TextView defaultTV = listItemView.findViewById(R.id.english_word);
        TextView miwokTV = listItemView.findViewById(R.id.miwok_word);
        ImageView wordImage = listItemView.findViewById(R.id.word_image);
        defaultTV.setText(getItem(position).getDefaultTranslation());
        miwokTV.setText(getItem(position).getMiwokTranslation());
        if (!getItem(position).hasImage()) {
            wordImage.setVisibility(GONE);
        } else {
            wordImage.setImageResource(getItem(position).getImageId());
        }
        listItemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (audioPlayer == null) {
                    audioPlayer = new AudioPlayer();
                }
                audioPlayer.prepareAsset(getContext(), getItem(position).getAudioId());
                audioPlayer.play();

            }
        });
        return listItemView;
    }

    public void releaseAudioPlayer() {
        if (audioPlayer != null) {
            audioPlayer.release();
        }
    }
}
