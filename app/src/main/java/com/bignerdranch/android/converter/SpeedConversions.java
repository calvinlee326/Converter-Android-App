package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeedConversions {
    public static final String FOOT_PER_HOUR = "Feet Per Hour";
    public static final String MILE_PER_HOUR = "Miles Per Hour";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            FOOT_PER_HOUR,
            MILE_PER_HOUR

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(FOOT_PER_HOUR, MILE_PER_HOUR, (Double x) -> x / 5280),
            new Conversion(MILE_PER_HOUR, FOOT_PER_HOUR, (Double x) -> x * 5280)
    ));

    public SpeedConversions() {}
}