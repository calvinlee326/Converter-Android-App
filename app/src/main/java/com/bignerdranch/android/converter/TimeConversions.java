package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeConversions {
    public static final String SECOND = "SECOND";
    public static final String MINUTE = "MINUTE";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            SECOND,
            MINUTE

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(SECOND, MINUTE, (Double x) -> x / 60),
            new Conversion(MINUTE, SECOND, (Double x) -> x * 60)
    ));

    public TimeConversions() {}
}