package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthConversions {
    public static final String INCH = "INCH";
    public static final String FOOT = "FOOT";
    public static final String MM = "MM";
    public static final String CM = "CM";
    public static final String DM = "DM";
    public static final String M = "M";
    public static final String KM = "KM";



    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            INCH,
            FOOT,
            MM,
            CM,
            DM,
            M,
            KM

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(INCH, FOOT, (Double x) -> x * 0.0833333),
            new Conversion(INCH, MM, (Double x) -> x * 25.4000000),
            new Conversion(INCH, CM, (Double x) -> x * 2.54),
            new Conversion(INCH, DM, (Double x) -> x * 0.254),
            new Conversion(INCH, M, (Double x) -> x * 0.0254000),
            new Conversion(INCH, KM, (Double x) -> x * 0.0000254),
            new Conversion(FOOT, INCH, (Double x) -> x * 12),
            new Conversion(FOOT, MM, (Double x) -> x * 304.8),
            new Conversion(FOOT, CM, (Double x) -> x * 30.48),
            new Conversion(FOOT, DM, (Double x) -> x * 3.048),
            new Conversion(FOOT, M, (Double x) -> x * 0.3048),
            new Conversion(FOOT, KM, (Double x) -> x * 0.0003048),
            new Conversion(MM, INCH, (Double x) -> x * 0.0393701),
            new Conversion(MM, FOOT, (Double x) -> x * 0.0032808),
            new Conversion(MM, CM, (Double x) -> x * 0.1),
            new Conversion(MM, DM, (Double x) -> x * 0.01),
            new Conversion(MM, M, (Double x) -> x * 0.001),
            new Conversion(MM, KM, (Double x) -> x * 0.000001),
            new Conversion(CM, INCH, (Double x) -> x * 0.3937008),
            new Conversion(CM, FOOT, (Double x) -> x * 0.0328084),
            new Conversion(CM, MM, (Double x) -> x * 10),
            new Conversion(CM, DM, (Double x) -> x * 0.1),
            new Conversion(CM, M, (Double x) -> x * 0.01),
            new Conversion(CM, KM, (Double x) -> x * 0.00001),
            new Conversion(DM, INCH, (Double x) -> x * 3.9370079),
            new Conversion(DM, FOOT, (Double x) -> x * 0.328084),
            new Conversion(DM, MM, (Double x) -> x * 100),
            new Conversion(DM, CM, (Double x) -> x * 10),
            new Conversion(DM, M, (Double x) -> x * 0.1),
            new Conversion(DM, KM, (Double x) -> x * 0.0001),
            new Conversion(M, INCH, (Double x) -> x * 39.3700787),
            new Conversion(M, FOOT, (Double x) -> x * 3.2808399),
            new Conversion(M, MM, (Double x) -> x * 1000),
            new Conversion(M, CM, (Double x) -> x * 100),
            new Conversion(M, DM, (Double x) -> x * 10),
            new Conversion(M, KM, (Double x) -> x * 0.001),
            new Conversion(KM, INCH, (Double x) -> x * 39370.0787402),
            new Conversion(KM, FOOT, (Double x) -> x * 3280.8398950),
            new Conversion(KM, MM, (Double x) -> x * 1000000),
            new Conversion(KM, CM, (Double x) -> x * 100000),
            new Conversion(KM, DM, (Double x) -> x * 10000),
            new Conversion(KM, M, (Double x) -> x * 1000)

    ));

    public LengthConversions() {}
}