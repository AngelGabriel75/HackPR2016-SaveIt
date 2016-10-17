package com.example.saulo.saveitnologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton dayStreak, tipMyself, slice, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        dayStreak = (ImageButton) findViewById(R.id.dayStreak);
        tipMyself = (ImageButton) findViewById(R.id.tipMyself);
        slice = (ImageButton) findViewById(R.id.slice);
        info = (ImageButton) findViewById(R.id.info);

        dayStreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dayStreakIntent = new Intent(MenuActivity.this, DayStreakActivity.class);

                startActivity(dayStreakIntent);
            }
        });

        tipMyself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tipMyselfIntent = new Intent(MenuActivity.this, TipMyselfActivity.class);
                startActivity(tipMyselfIntent);
            }
        });
        slice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sliceIntent = new Intent(MenuActivity.this, SliceActivity.class);
                startActivity(sliceIntent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infoIntent = new Intent(MenuActivity.this, InfoActivity.class);
                startActivity(infoIntent);
            }
        });
    }
}