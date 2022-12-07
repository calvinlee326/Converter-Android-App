package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaConversions {
    public static final String SQUARE_INCH = "SQUARE_INCH";
    public static final String SQUARE_FOOT = "SQUARE_FOOT";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            SQUARE_INCH,
            SQUARE_FOOT

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(SQUARE_INCH, SQUARE_FOOT, (Double x) -> x / 144),
            new Conversion(SQUARE_FOOT, SQUARE_INCH, (Double x) -> x * 144)
    ));

    public AreaConversions() {}
}