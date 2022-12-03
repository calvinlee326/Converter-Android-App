package com.bignerdranch.android.converter;


import static com.bignerdranch.android.converter.WeightConversions.conversions;
import static com.bignerdranch.android.converter.WeightConversions.values;


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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WeightConversions {
    private static final String OUNCE  = "OUNCE";
    private static final String CUP = "CUP";
    private static final String PINT = "PINT";

    // These are the available weight units
    public static final String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            OUNCE,
            CUP,
            PINT
    };

    static List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(PINT, CUP, (Double x) -> x * 2),
            // In 1 PINT there are 2 CUP
            // So with x PINT return that the number of CUP is x * 2

            // Again, there are 2 CUP in 1 PINT
            // If you have x CUP, then the number of PINT you have is x / 2
            new Conversion(CUP, PINT, (Double x) -> x / 2),

            new Conversion(CUP, OUNCE, (Double x) -> x * 8),
            new Conversion(OUNCE, CUP, (Double x) -> x / 8)

    ));
}

public class weight_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = values[0];
    String toUnit = values[1];
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.weight_relativelayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[1]);

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
                    for (Conversion c : conversions) {
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = values;

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

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = values;

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
