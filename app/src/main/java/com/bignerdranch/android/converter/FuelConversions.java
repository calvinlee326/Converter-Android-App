package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuelConversions {
    public static final String BARREL = "BARREL";
    public static final String GALLON = "GALLON";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            BARREL,
            GALLON

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(BARREL, GALLON, (Double x) -> x / 42),
            new Conversion(GALLON, BARREL, (Double x) -> x * 42)
    ));

    public FuelConversions() {}
}