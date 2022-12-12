package com.bignerdranch.android.converter;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public class Progress_dialog {
    public AlertDialog dialog;

    @NotNull
    public final AlertDialog getDialog() {
        AlertDialog var10000 = this.dialog;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        return var10000;
    }

    public final void setDialog(@NotNull AlertDialog var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.dialog = var1;
    }

    public final void closeProgress() {
        AlertDialog var10000 = this.dialog;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        if (var10000 != null) {
            var10000 = this.dialog;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }

            var10000.dismiss();
        }

    }

    public final void showProgress(@Nullable Context mContext) {
        int llPadding = 30;
        LinearLayout ll = new LinearLayout(mContext);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setPadding(llPadding, llPadding, llPadding, llPadding);
        ll.setGravity(17);
        LinearLayout.LayoutParams llParam = new LinearLayout.LayoutParams(-2, -2);
        llParam.gravity = 17;
        ll.setLayoutParams((android.view.ViewGroup.LayoutParams)llParam);
        ProgressBar progressBar = new ProgressBar(mContext);
        progressBar.setIndeterminate(true);
        progressBar.setPadding(0, 0, llPadding, 0);
        progressBar.setLayoutParams((android.view.ViewGroup.LayoutParams)llParam);
        llParam = new LinearLayout.LayoutParams(-2, -2);
        llParam.gravity = 17;
        TextView tvText = new TextView(mContext);
        tvText.setText((CharSequence)"Loading ...");
        tvText.setTextColor(Color.parseColor("#000000"));
        tvText.setTextSize(20.0F);
        tvText.setLayoutParams((android.view.ViewGroup.LayoutParams)llParam);
        ll.addView((View)progressBar);
        ll.addView((View)tvText);
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setCancelable(false);
        builder.setView((View)ll);
        AlertDialog var10001 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var10001, "builder.create()");
        this.dialog = var10001;
        AlertDialog var10000 = this.dialog;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        var10000.show();
        var10000 = this.dialog;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }

        Window window = var10000.getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -2;
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }

    }


}
