package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VolumeConversions {
    public static final String CU_INCH = "Cubic Inch";
    public static final String CU_FOOT = "Cubic Foot";
    public static final String CU_MM   = "Cubic mm";
    public static final String CU_CM   = "Cubic cm";
    public static final String CU_DM   = "Liter";
    public static final String CU_M    = "Cubic Meter";

    public String[] values = new String[]{
            CU_MM, CU_CM, CU_DM, CU_M, CU_INCH, CU_FOOT
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(CU_INCH, CU_FOOT, (Double x) -> x * 0.000578704),
            new Conversion(CU_INCH, CU_MM,   (Double x) -> x * 16387.064),
            new Conversion(CU_INCH, CU_CM,   (Double x) -> x * 16.387064),
            new Conversion(CU_INCH, CU_DM,   (Double x) -> x * 0.016387064),
            new Conversion(CU_INCH, CU_M,    (Double x) -> x * 0.000016387064),

            new Conversion(CU_FOOT, CU_INCH, (Double x) -> x * 1728.0),
            new Conversion(CU_FOOT, CU_MM,   (Double x) -> x * 28316846.592),
            new Conversion(CU_FOOT, CU_CM,   (Double x) -> x * 28316.846592),
            new Conversion(CU_FOOT, CU_DM,   (Double x) -> x * 28.316846592),
            new Conversion(CU_FOOT, CU_M,    (Double x) -> x * 0.028316846592),

            new Conversion(CU_MM, CU_INCH, (Double x) -> x * 0.0000610237),
            new Conversion(CU_MM, CU_FOOT, (Double x) -> x * 3.5314667e-8),
            new Conversion(CU_MM, CU_CM,   (Double x) -> x * 0.001),
            new Conversion(CU_MM, CU_DM,   (Double x) -> x * 0.000001),
            new Conversion(CU_MM, CU_M,    (Double x) -> x * 1.0e-9),

            new Conversion(CU_CM, CU_INCH, (Double x) -> x * 0.0610237),
            new Conversion(CU_CM, CU_FOOT, (Double x) -> x * 0.0000353147),
            new Conversion(CU_CM, CU_MM,   (Double x) -> x * 1000.0),
            new Conversion(CU_CM, CU_DM,   (Double x) -> x * 0.001),
            new Conversion(CU_CM, CU_M,    (Double x) -> x * 0.000001),

            new Conversion(CU_DM, CU_INCH, (Double x) -> x * 61.0237441),
            new Conversion(CU_DM, CU_FOOT, (Double x) -> x * 0.0353147),
            new Conversion(CU_DM, CU_MM,   (Double x) -> x * 1_000_000.0),
            new Conversion(CU_DM, CU_CM,   (Double x) -> x * 1000.0),
            new Conversion(CU_DM, CU_M,    (Double x) -> x * 0.001),

            new Conversion(CU_M, CU_INCH, (Double x) -> x * 61023.7441),
            new Conversion(CU_M, CU_FOOT, (Double x) -> x * 35.3146667),
            new Conversion(CU_M, CU_MM,   (Double x) -> x * 1.0e9),
            new Conversion(CU_M, CU_CM,   (Double x) -> x * 1_000_000.0),
            new Conversion(CU_M, CU_DM,   (Double x) -> x * 1000.0)
    ));

    public VolumeConversions() {}
}
