package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaConversions {
    public static final String SQUARE_INCH = "SQUARE_INCH";
    public static final String SQUARE_FOOT = "SQUARE_FOOT";
    public static final String SQUARE_YARD = "SQUARE_YARD";
    public static final String SQUARE_MM = "SQUARE_MM";
    public static final String SQUARE_CM = "SQUARE_CM";
    public static final String SQUARE_DM = "SQUARE_DM";
    public static final String SQUARE_M = "SQUARE_M";
    public static final String SQUARE_KM = "SQUARE_KM";



    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            SQUARE_INCH,
            SQUARE_FOOT,
            SQUARE_YARD,
            SQUARE_MM,
            SQUARE_CM,
            SQUARE_DM,
            SQUARE_M,
            SQUARE_KM


    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(SQUARE_INCH, SQUARE_FOOT, (Double x) -> x * 0.0069444),
            new Conversion(SQUARE_INCH, SQUARE_YARD, (Double x) -> x * 0.0007716),
            new Conversion(SQUARE_INCH, SQUARE_MM, (Double x) -> x * 645.1600000),
            new Conversion(SQUARE_INCH, SQUARE_CM, (Double x) -> x * 6.4516000),
            new Conversion(SQUARE_INCH, SQUARE_DM, (Double x) -> x * 0.064516),
            new Conversion(SQUARE_INCH, SQUARE_M, (Double x) -> x * 0.0006452),
            new Conversion(SQUARE_INCH, SQUARE_KM, (Double x) -> x * 0.00000000064516),
            new Conversion(SQUARE_FOOT, SQUARE_INCH, (Double x) -> x * 144),
            new Conversion(SQUARE_FOOT, SQUARE_YARD, (Double x) -> x * 0.1111111),
            new Conversion(SQUARE_FOOT, SQUARE_MM, (Double x) -> x * 92903.0400000),
            new Conversion(SQUARE_FOOT, SQUARE_CM, (Double x) -> x * 929.0304),
            new Conversion(SQUARE_FOOT, SQUARE_DM, (Double x) -> x * 9.290304),
            new Conversion(SQUARE_FOOT, SQUARE_M, (Double x) -> x * 0.0929030),
            new Conversion(SQUARE_FOOT, SQUARE_KM, (Double x) -> x * 0.000000092903),
            new Conversion(SQUARE_YARD, SQUARE_INCH, (Double x) -> x * 1296),
            new Conversion(SQUARE_YARD, SQUARE_FOOT, (Double x) -> x * 9),
            new Conversion(SQUARE_YARD, SQUARE_MM, (Double x) -> x * 836127.3600000),
            new Conversion(SQUARE_YARD, SQUARE_CM, (Double x) -> x * 8361.2736),
            new Conversion(SQUARE_YARD, SQUARE_DM, (Double x) -> x * 83.612736),
            new Conversion(SQUARE_YARD, SQUARE_M, (Double x) -> x * 0.8361274),
            new Conversion(SQUARE_YARD, SQUARE_KM, (Double x) -> x * 0.00000083613),
            new Conversion(SQUARE_MM, SQUARE_INCH, (Double x) -> x * 0.0015500),
            new Conversion(SQUARE_MM, SQUARE_FOOT, (Double x) -> x * 0.0000108),
            new Conversion(SQUARE_MM, SQUARE_YARD, (Double x) -> x * 0.0000012),
            new Conversion(SQUARE_MM, SQUARE_CM, (Double x) -> x * 0.01),
            new Conversion(SQUARE_MM, SQUARE_DM, (Double x) -> x * 0.0001),
            new Conversion(SQUARE_MM, SQUARE_M, (Double x) -> x * 0.000001),
            new Conversion(SQUARE_MM, SQUARE_KM, (Double x) -> x * 0.000000000001),
            new Conversion(SQUARE_CM, SQUARE_INCH, (Double x) -> x * 0.1550003),
            new Conversion(SQUARE_CM, SQUARE_FOOT, (Double x) -> x * 0.0010764),
            new Conversion(SQUARE_CM, SQUARE_YARD, (Double x) -> x * 0.0001196),
            new Conversion(SQUARE_CM, SQUARE_MM, (Double x) -> x * 100.0000000),
            new Conversion(SQUARE_CM, SQUARE_DM, (Double x) -> x * 0.01),
            new Conversion(SQUARE_CM, SQUARE_M, (Double x) -> x * 0.0001),
            new Conversion(SQUARE_CM, SQUARE_KM, (Double x) -> x * 0.0000000001),
            new Conversion(SQUARE_DM, SQUARE_INCH, (Double x) -> x * 15.5000310),
            new Conversion(SQUARE_DM, SQUARE_FOOT, (Double x) -> x * 0.1076391),
            new Conversion(SQUARE_DM, SQUARE_YARD, (Double x) -> x * 0.0119599),
            new Conversion(SQUARE_DM, SQUARE_MM, (Double x) -> x * 10000.0000000),
            new Conversion(SQUARE_DM, SQUARE_CM, (Double x) -> x * 100.0000000),
            new Conversion(SQUARE_DM, SQUARE_M, (Double x) -> x * 0.0100000),
            new Conversion(SQUARE_DM, SQUARE_KM, (Double x) -> x * 0.00000001),
            new Conversion(SQUARE_M, SQUARE_INCH, (Double x) -> x * 1550.0031000),
            new Conversion(SQUARE_M, SQUARE_FOOT, (Double x) -> x * 10.7639104),
            new Conversion(SQUARE_M, SQUARE_YARD, (Double x) -> x * 1.1959900),
            new Conversion(SQUARE_M, SQUARE_MM, (Double x) -> x * 1000000),
            new Conversion(SQUARE_M, SQUARE_CM, (Double x) -> x * 10000),
            new Conversion(SQUARE_M, SQUARE_DM, (Double x) -> x * 100),
            new Conversion(SQUARE_M, SQUARE_KM, (Double x) -> x * 0.000001),
            new Conversion(SQUARE_KM, SQUARE_INCH, (Double x) -> x * 1550003100.0061998),
            new Conversion(SQUARE_KM, SQUARE_FOOT, (Double x) -> x * 10763910.4167097),
            new Conversion(SQUARE_KM, SQUARE_YARD, (Double x) -> x * 1195990.0463011),
            new Conversion(SQUARE_KM, SQUARE_DM, (Double x) -> x * 100000000),
            new Conversion(SQUARE_KM, SQUARE_M, (Double x) -> x * 1000000)

    ));

    public AreaConversions() {}
}