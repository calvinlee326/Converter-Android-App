package com.bignerdranch.android.converter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class currency_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    String fromUnit = "USD";
    String toUnit = "CNY";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "USD",
            "CNY",
            "JPY",
            "GBP",
            "NOK",
            "CHF",
            "KRW"
    };

    Progress_dialog wait= new Progress_dialog();

    Context mContext = this;



    private void get(String to, String from, double amount){
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://open.er-api.com/v6/latest/"+ from)
                .get()
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                runOnUiThread(() -> {
                    if (wait != null) wait.closeProgress();
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    runOnUiThread(() -> {
                        if (wait != null) wait.closeProgress();
                    });
                    return;
                }

                if (response.body() == null) {
                    runOnUiThread(() -> {
                        if (wait != null) wait.closeProgress();
                    });
                    return;
                }

                String result = response.body().string();
                Map<String, Object> resultMap = new Gson().fromJson(result, new TypeToken<HashMap<String, Object>>(){}.getType());
                Map<String, Double> rateMap = (Map<String, Double>) resultMap.get("rates");
                double rate = rateMap.get(toUnit);
                double conversionResult = amount * rate;

                runOnUiThread(() -> {
                    if (wait != null) wait.closeProgress();
                    et_toUnit.setText(String.valueOf(conversionResult));
                });
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);


        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[1]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1= tv_toUnit.getText().toString();
                String t2 = tv_fromUnit.getText().toString();
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput == null || tempInput.isEmpty()) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (t1.equals(t2)) {
                        et_toUnit.setText(tempInput);
                    } else {
                        wait.showProgress(mContext);
                        get(t1, t2, Double.parseDouble(tempInput));
                    }

                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(currency_cal.this);
                builder.setTitle("choose Unit");

                builder.setSingleChoiceItems(
                        values, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                toUnit = values[i];
                                tv_toUnit.setText(toUnit);
                            }
                        });

                builder.setPositiveButton("OK", (d, i) -> d.dismiss());
                builder.create().show();
            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(currency_cal.this);
                builder.setTitle("choose Unit");

                builder.setSingleChoiceItems(
                        values,
                        -1,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                fromUnit = values[i];
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", (d, i) -> d.dismiss());
                builder.create().show();

            }
        });

    }


}