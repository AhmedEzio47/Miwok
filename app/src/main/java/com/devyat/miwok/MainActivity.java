package com.devyat.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.devyat.miwok.activities.ColorActivity;
import com.devyat.miwok.activities.FamilyActivity;
import com.devyat.miwok.activities.NumbersActivity;
import com.devyat.miwok.activities.PhrasesActivity;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerOnClickListeners();
    }

    private void registerOnClickListeners() {
        onNumbersClick();
        onFamilyClick();
        onColorsClick();
        onPhrasesClick();
    }

    private void startActivityOnClick(int id, Class c) {
        View tv = findViewById(id);
        Intent intent = new Intent(this, c);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    private void onNumbersClick() {
        startActivityOnClick(R.id.numbers, NumbersActivity.class);
    }

    private void onFamilyClick() {
        startActivityOnClick(R.id.family, FamilyActivity.class);
    }

    private void onColorsClick() {
        startActivityOnClick(R.id.colors, ColorActivity.class);
    }

    private void onPhrasesClick() {
        startActivityOnClick(R.id.phrases, PhrasesActivity.class);
    }

}