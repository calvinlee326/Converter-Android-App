package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightConversions {
    public static final String OUNCE  = "OUNCE";
    public static final String Milligram = "Milligram";
    public static final String Gram = "Gram";
    public static final String Kilogram = "Kilogram";
    public static final String Ton = "Ton";
    public static final String LB = "LB";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            OUNCE,
            Milligram,
            Gram,
            Kilogram,
            Ton,
            LB

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(

            new Conversion(Milligram, Gram, (Double x) -> x / 1000),
            new Conversion(Milligram, Kilogram, (Double x) -> x / 1000000),
            new Conversion(Milligram, Ton, (Double x) -> x * 0.000000001),
            new Conversion(Milligram, OUNCE, (Double x) -> x * 0.000035274),
            new Conversion(Milligram, LB, (Double x) -> x * 0.0000022),
            new Conversion(Gram, Milligram, (Double x) -> x * 1000),
            new Conversion(Gram, Kilogram, (Double x) -> x / 1000),
            new Conversion(Gram, Ton, (Double x) -> x * 0.000001),
            new Conversion(Gram, OUNCE, (Double x) -> x * 0.035274),
            new Conversion(Gram, LB, (Double x) -> x * 0.002205),
            new Conversion(Kilogram, Milligram, (Double x) -> x * 1000000),
            new Conversion(Kilogram, Gram, (Double x) -> x * 1000),
            new Conversion(Kilogram, Ton, (Double x) -> x / 1000),
            new Conversion(Kilogram, OUNCE, (Double x) -> x * 35.27396),
            new Conversion(Kilogram, LB, (Double x) -> x * 2.205),
            new Conversion(Ton, Milligram, (Double x) -> x * 1000000000),
            new Conversion(Ton, Gram, (Double x) -> x * 1000000),
            new Conversion(Ton, Kilogram, (Double x) -> x * 1000),
            new Conversion(Ton, OUNCE, (Double x) -> x * 35273.9619),
            new Conversion(Ton, LB, (Double x) -> x * 2204.6226),
            new Conversion(OUNCE, Milligram, (Double x) -> x * 28349.5231),
            new Conversion(OUNCE, Gram, (Double x) -> x * 28.3495),
            new Conversion(OUNCE, Kilogram, (Double x) -> x * 0.0283),
            new Conversion(OUNCE, Ton, (Double x) -> x * 0.00002835),
            new Conversion(OUNCE, LB, (Double x) -> x * 0.0625),
            new Conversion(LB, Milligram, (Double x) -> x * 453592.37),
            new Conversion(LB, Gram, (Double x) -> x * 453.5924),
            new Conversion(LB, Kilogram, (Double x) -> x * 0.4536),
            new Conversion(LB, Ton, (Double x) -> x * 0.0004536),
            new Conversion(LB, OUNCE, (Double x) -> x * 16)
    ));

    public WeightConversions() {}
}