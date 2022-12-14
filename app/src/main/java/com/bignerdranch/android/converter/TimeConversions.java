package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeConversions {
    public static final String SECOND = "SECOND";
    public static final String MINUTE = "MINUTE";
    public static final String HOUR = "HOUR";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            SECOND,
            MINUTE,
            HOUR

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(SECOND, MINUTE, (Double x) -> x / 60),
            new Conversion(SECOND, HOUR, (Double x) -> x / 3600),
            new Conversion(MINUTE, SECOND, (Double x) -> x * 60),
            new Conversion(MINUTE, HOUR, (Double x) -> x / 60),
            new Conversion(HOUR, SECOND, (Double x) -> x * 3600),
            new Conversion(HOUR, MINUTE, (Double x) -> x * 60)
    ));

    public TimeConversions() {}
}