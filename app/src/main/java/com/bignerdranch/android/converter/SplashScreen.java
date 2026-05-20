package com.bignerdranch.android.converter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static final int LAUNCH_DELAY_MS = 2400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo    = findViewById(R.id.iv_splash_logo);
        View      divider = findViewById(R.id.v_splash_divider);
        TextView  title   = findViewById(R.id.tv_splash_title);
        TextView  tagline = findViewById(R.id.tv_splash_tagline);

        logo.setScaleX(0.2f);
        logo.setScaleY(0.2f);
        logo.setAlpha(0f);

        divider.setScaleX(0f);
        divider.setAlpha(0f);

        title.setTranslationY(40f);
        title.setAlpha(0f);

        tagline.setTranslationY(30f);
        tagline.setAlpha(0f);

        // Logo: spring in
        logo.animate()
                .scaleX(1f).scaleY(1f).alpha(1f)
                .setDuration(700)
                .setStartDelay(120)
                .setInterpolator(new OvershootInterpolator(1.6f))
                .start();

        // Divider: expand horizontally
        divider.animate()
                .scaleX(1f).alpha(1f)
                .setDuration(500)
                .setStartDelay(450)
                .start();

        // Title: rise and fade
        title.animate()
                .translationY(0f).alpha(1f)
                .setDuration(550)
                .setStartDelay(620)
                .start();

        // Tagline: subtle rise
        tagline.animate()
                .translationY(0f).alpha(1f)
                .setDuration(500)
                .setStartDelay(820)
                .start();

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }, LAUNCH_DELAY_MS);
    }
}
