package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VolumeConversions {
    public static final String CUBIC_INCH = "CUBIC_INCH";
    public static final String CUBIC_FOOT = "CUBIC_FOOT";
    public static final String CUBIC_MM = "CUBIC_MM";
    public static final String CUBIC_CM = "CUBIC_CM";
    public static final String CUBIC_DM = "CUBIC_DM";
    public static final String CUBIC_M = "CUBIC_M";


    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            CUBIC_INCH,
            CUBIC_FOOT,
            CUBIC_MM,
            CUBIC_CM,
            CUBIC_DM,
            CUBIC_M

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(CUBIC_INCH, CUBIC_FOOT, (Double x) -> x * 0.0005787),
            new Conversion(CUBIC_INCH, CUBIC_MM, (Double x) -> x * 16387.0640000),
            new Conversion(CUBIC_INCH, CUBIC_CM, (Double x) -> x * 16.387064),
            new Conversion(CUBIC_INCH, CUBIC_DM, (Double x) -> x * 0.0163871),
            new Conversion(CUBIC_INCH, CUBIC_M, (Double x) -> x * 0.0000164),
            new Conversion(CUBIC_FOOT, CUBIC_INCH, (Double x) -> x * 1728),
            new Conversion(CUBIC_FOOT, CUBIC_MM, (Double x) -> x * 28316846.5920000),
            new Conversion(CUBIC_FOOT, CUBIC_CM, (Double x) -> x * 28316.846592),
            new Conversion(CUBIC_FOOT, CUBIC_DM, (Double x) -> x * 28.3168466),
            new Conversion(CUBIC_FOOT, CUBIC_M, (Double x) -> x * 0.0283168),
            new Conversion(CUBIC_MM, CUBIC_INCH, (Double x) -> x * 0.0000610),
            new Conversion(CUBIC_MM, CUBIC_FOOT, (Double x) -> x * 0.000000035315),
            new Conversion(CUBIC_MM, CUBIC_CM, (Double x) -> x * 0.001),
            new Conversion(CUBIC_MM, CUBIC_DM, (Double x) -> x * 0.000001),
            new Conversion(CUBIC_MM, CUBIC_M, (Double x) -> x * 0.000000001),
            new Conversion(CUBIC_CM, CUBIC_INCH, (Double x) -> x * 0.0610237),
            new Conversion(CUBIC_CM, CUBIC_FOOT, (Double x) -> x * 0.0000353),
            new Conversion(CUBIC_CM, CUBIC_MM, (Double x) -> x * 1000),
            new Conversion(CUBIC_CM, CUBIC_DM, (Double x) -> x * 0.001),
            new Conversion(CUBIC_CM, CUBIC_M, (Double x) -> x * 0.000001),
            new Conversion(CUBIC_DM, CUBIC_INCH, (Double x) -> x * 61.0237441),
            new Conversion(CUBIC_DM, CUBIC_FOOT, (Double x) -> x * 0.0353147),
            new Conversion(CUBIC_DM, CUBIC_MM, (Double x) -> x * 1000000),
            new Conversion(CUBIC_DM, CUBIC_CM, (Double x) -> x * 1000),
            new Conversion(CUBIC_DM, CUBIC_M, (Double x) -> x * 0.001),
            new Conversion(CUBIC_M, CUBIC_INCH, (Double x) -> x * 61023.7440947),
            new Conversion(CUBIC_M, CUBIC_FOOT, (Double x) -> x * 35.3146667),
            new Conversion(CUBIC_M, CUBIC_MM, (Double x) -> x * 1000000000),
            new Conversion(CUBIC_M, CUBIC_CM, (Double x) -> x * 1000000),
            new Conversion(CUBIC_M, CUBIC_DM, (Double x) -> x * 1000)


    ));

    public VolumeConversions() {}
}