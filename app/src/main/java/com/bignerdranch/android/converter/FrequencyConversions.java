package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyConversions {
    public static final String HERTZ = "HERTZ";
    public static final String KILOHERTZ = "KILOHERTZ";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            HERTZ,
            KILOHERTZ

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(HERTZ, KILOHERTZ, (Double x) -> x / 1000),
            new Conversion(KILOHERTZ, HERTZ, (Double x) -> x * 1000)
    ));

    public FrequencyConversions() {}
}