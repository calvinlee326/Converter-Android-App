package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VolumeConversions {
    public static final String CUBIC_INCH = "CUBIC_INCH";
    public static final String CUBIC_FOOT = "CUBIC_FOOT";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            CUBIC_INCH,
            CUBIC_FOOT

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(CUBIC_INCH, CUBIC_FOOT, (Double x) -> x / 1728),
            new Conversion(CUBIC_FOOT, CUBIC_INCH, (Double x) -> x * 1728)
    ));

    public VolumeConversions() {}
}