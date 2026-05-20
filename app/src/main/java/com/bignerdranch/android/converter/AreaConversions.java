package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaConversions {
    public static final String SQ_INCH = "Square Inch";
    public static final String SQ_FOOT = "Square Foot";
    public static final String SQ_YARD = "Square Yard";
    public static final String SQ_MM   = "Square mm";
    public static final String SQ_CM   = "Square cm";
    public static final String SQ_DM   = "Square dm";
    public static final String SQ_M    = "Square Meter";
    public static final String SQ_KM   = "Square km";

    public String[] values = new String[]{
            SQ_MM, SQ_CM, SQ_DM, SQ_M, SQ_KM, SQ_INCH, SQ_FOOT, SQ_YARD
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(SQ_INCH, SQ_FOOT, (Double x) -> x * 0.00694444),
            new Conversion(SQ_INCH, SQ_YARD, (Double x) -> x * 0.00077160),
            new Conversion(SQ_INCH, SQ_MM,   (Double x) -> x * 645.16),
            new Conversion(SQ_INCH, SQ_CM,   (Double x) -> x * 6.4516),
            new Conversion(SQ_INCH, SQ_DM,   (Double x) -> x * 0.064516),
            new Conversion(SQ_INCH, SQ_M,    (Double x) -> x * 0.00064516),
            new Conversion(SQ_INCH, SQ_KM,   (Double x) -> x * 6.4516e-10),

            new Conversion(SQ_FOOT, SQ_INCH, (Double x) -> x * 144.0),
            new Conversion(SQ_FOOT, SQ_YARD, (Double x) -> x * 0.111111),
            new Conversion(SQ_FOOT, SQ_MM,   (Double x) -> x * 92903.04),
            new Conversion(SQ_FOOT, SQ_CM,   (Double x) -> x * 929.0304),
            new Conversion(SQ_FOOT, SQ_DM,   (Double x) -> x * 9.290304),
            new Conversion(SQ_FOOT, SQ_M,    (Double x) -> x * 0.09290304),
            new Conversion(SQ_FOOT, SQ_KM,   (Double x) -> x * 9.290304e-8),

            new Conversion(SQ_YARD, SQ_INCH, (Double x) -> x * 1296.0),
            new Conversion(SQ_YARD, SQ_FOOT, (Double x) -> x * 9.0),
            new Conversion(SQ_YARD, SQ_MM,   (Double x) -> x * 836127.36),
            new Conversion(SQ_YARD, SQ_CM,   (Double x) -> x * 8361.2736),
            new Conversion(SQ_YARD, SQ_DM,   (Double x) -> x * 83.612736),
            new Conversion(SQ_YARD, SQ_M,    (Double x) -> x * 0.83612736),
            new Conversion(SQ_YARD, SQ_KM,   (Double x) -> x * 8.3612736e-7),

            new Conversion(SQ_MM, SQ_INCH, (Double x) -> x * 0.0015500031),
            new Conversion(SQ_MM, SQ_FOOT, (Double x) -> x * 1.07639e-5),
            new Conversion(SQ_MM, SQ_YARD, (Double x) -> x * 1.19599e-6),
            new Conversion(SQ_MM, SQ_CM,   (Double x) -> x * 0.01),
            new Conversion(SQ_MM, SQ_DM,   (Double x) -> x * 0.0001),
            new Conversion(SQ_MM, SQ_M,    (Double x) -> x * 1.0e-6),
            new Conversion(SQ_MM, SQ_KM,   (Double x) -> x * 1.0e-12),

            new Conversion(SQ_CM, SQ_INCH, (Double x) -> x * 0.15500031),
            new Conversion(SQ_CM, SQ_FOOT, (Double x) -> x * 0.00107639),
            new Conversion(SQ_CM, SQ_YARD, (Double x) -> x * 0.00011960),
            new Conversion(SQ_CM, SQ_MM,   (Double x) -> x * 100.0),
            new Conversion(SQ_CM, SQ_DM,   (Double x) -> x * 0.01),
            new Conversion(SQ_CM, SQ_M,    (Double x) -> x * 0.0001),
            new Conversion(SQ_CM, SQ_KM,   (Double x) -> x * 1.0e-10),

            new Conversion(SQ_DM, SQ_INCH, (Double x) -> x * 15.500031),
            new Conversion(SQ_DM, SQ_FOOT, (Double x) -> x * 0.107639),
            new Conversion(SQ_DM, SQ_YARD, (Double x) -> x * 0.011960),
            new Conversion(SQ_DM, SQ_MM,   (Double x) -> x * 10000.0),
            new Conversion(SQ_DM, SQ_CM,   (Double x) -> x * 100.0),
            new Conversion(SQ_DM, SQ_M,    (Double x) -> x * 0.01),
            new Conversion(SQ_DM, SQ_KM,   (Double x) -> x * 1.0e-8),

            new Conversion(SQ_M, SQ_INCH, (Double x) -> x * 1550.0031),
            new Conversion(SQ_M, SQ_FOOT, (Double x) -> x * 10.7639104),
            new Conversion(SQ_M, SQ_YARD, (Double x) -> x * 1.19599),
            new Conversion(SQ_M, SQ_MM,   (Double x) -> x * 1_000_000.0),
            new Conversion(SQ_M, SQ_CM,   (Double x) -> x * 10_000.0),
            new Conversion(SQ_M, SQ_DM,   (Double x) -> x * 100.0),
            new Conversion(SQ_M, SQ_KM,   (Double x) -> x * 1.0e-6),

            new Conversion(SQ_KM, SQ_INCH, (Double x) -> x * 1.5500031e9),
            new Conversion(SQ_KM, SQ_FOOT, (Double x) -> x * 1.07639104e7),
            new Conversion(SQ_KM, SQ_YARD, (Double x) -> x * 1.19599e6),
            new Conversion(SQ_KM, SQ_MM,   (Double x) -> x * 1.0e12),
            new Conversion(SQ_KM, SQ_CM,   (Double x) -> x * 1.0e10),
            new Conversion(SQ_KM, SQ_DM,   (Double x) -> x * 1.0e8),
            new Conversion(SQ_KM, SQ_M,    (Double x) -> x * 1_000_000.0)
    ));

    public AreaConversions() {}
}
