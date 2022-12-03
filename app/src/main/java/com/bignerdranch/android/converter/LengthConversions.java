package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthConversions {
    public static final String INCH = "INCH";
    public static final String FOOT = "FOOT";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            INCH,
            FOOT

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(INCH, FOOT, (Double x) -> x / 12),
            new Conversion(FOOT, INCH, (Double x) -> x * 12)
    ));

    public LengthConversions() {}
}