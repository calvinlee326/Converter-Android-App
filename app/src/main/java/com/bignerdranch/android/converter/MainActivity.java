package com.bignerdranch.android.converter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wire(R.id.cv_tmp,      temp_cal.class);
        wire(R.id.cv_weight,   weight_cal.class);
        wire(R.id.cv_length,   length_cal.class);
        wire(R.id.cv_speed,    speed_cal.class);
        wire(R.id.cv_currency, currency_cal.class);
        wire(R.id.cv_Volume,   volume_cal.class);
        wire(R.id.cv_time,     time_cal.class);
        wire(R.id.cv_area,     area_cal.class);
        wire(R.id.cv_fuel,     fuel_cal.class);

        animateEntrance(new int[]{
                R.id.cv_tmp, R.id.cv_weight, R.id.cv_length,
                R.id.cv_speed, R.id.cv_currency, R.id.cv_Volume,
                R.id.cv_time, R.id.cv_area, R.id.cv_fuel
        });
    }

    private void wire(int cardId, Class<?> dest) {
        View card = findViewById(cardId);
        if (card == null) {
            Log.e(TAG, "Card not found: " + getResources().getResourceEntryName(cardId));
            return;
        }
        card.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(MainActivity.this, dest);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            } catch (Throwable t) {
                Log.e(TAG, "Failed to launch " + dest.getSimpleName(), t);
            }
        });
    }

    private void animateEntrance(int[] cardIds) {
        for (int i = 0; i < cardIds.length; i++) {
            View card = findViewById(cardIds[i]);
            if (card == null) continue;
            card.setAlpha(0f);
            card.setTranslationY(90f);
            card.animate()
                    .alpha(1f).translationY(0f)
                    .setDuration(380)
                    .setStartDelay(i * 50L)
                    .setInterpolator(new OvershootInterpolator(1.1f))
                    .start();
        }
    }
}
