package com.bignerdranch.android.converter;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progress_dialog {

    private AlertDialog dialog;

    public void showProgress(Context context) {
        int padding = 30;

        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setPadding(padding, padding, padding, padding);
        ll.setGravity(android.view.Gravity.CENTER);

        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        LinearLayout.LayoutParams pbParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        pbParams.setMargins(0, 0, padding, 0);
        progressBar.setLayoutParams(pbParams);

        TextView tvText = new TextView(context);
        tvText.setText("Fetching rates…");
        tvText.setTextColor(Color.parseColor("#FFFFFF"));
        tvText.setTextSize(16f);

        ll.addView(progressBar);
        ll.addView(tvText);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setView(ll);
        dialog = builder.create();
        dialog.show();

        Window window = dialog.getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams params =
                    new android.view.WindowManager.LayoutParams();
            params.copyFrom(window.getAttributes());
            params.width = android.view.WindowManager.LayoutParams.WRAP_CONTENT;
            params.height = android.view.WindowManager.LayoutParams.WRAP_CONTENT;
            window.setAttributes(params);
        }
    }

    public void closeProgress() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        dialog = null;
    }
}
