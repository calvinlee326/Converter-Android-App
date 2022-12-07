package com.bignerdranch.android.converter;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class speed_cal extends AppCompatActivity {
    // The weight conversions are defined in the "WeightConversions" file.
    SpeedConversions speedConversions = new SpeedConversions();
    // user-inputted values can be added to the "values" and "conversions" attributes of the
    // variable above to allow the user to define new conversions.

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = speedConversions.values[0];
    String toUnit = speedConversions.values[1];
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed_cal);
        mCLayout = findViewById(R.id.speed_relativeLayout);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);


        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(speedConversions.values[0]);
        tv_toUnit.setText(speedConversions.values[1]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();

                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    String startUnit = tv_fromUnit.getText().toString();
                    String endUnit = tv_toUnit.getText().toString();
                    Function<Double, Double> conversionFunction = (Double x) -> {
                        throw new RuntimeException("No conversion was found for these units");
                    };
                    for (Conversion c : speedConversions.conversions) {
                        if (c.startUnit == startUnit && c.endUnit == endUnit) {
                            conversionFunction = c.conversionFunction;
                            break;
                        }
                    }
                    if (startUnit == endUnit) {
                        conversionFunction = (Double x) -> x; // output the input, no conversion.
                    }
                    Double startValue = Double.parseDouble(tempInput);
                    try {
                        Double endValue = conversionFunction.apply(startValue);
                        et_toUnit.setText(endValue.toString());
                    } catch (Exception e) {
                        Context context = getApplicationContext();
                        CharSequence text = e.getMessage();
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context,text, duration);
                        toast.show();
                    }

                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = speedConversions.values;

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = speedConversions.values;

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });
    }
}
