package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightConversions {
    public static final String OUNCE     = "Ounce";
    public static final String Milligram = "Milligram";
    public static final String Gram      = "Gram";
    public static final String Kilogram  = "Kilogram";
    public static final String Ton       = "Metric Ton";
    public static final String LB        = "Pound";

    public String[] values = new String[]{
            Milligram, Gram, Kilogram, Ton, OUNCE, LB
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(Milligram, Gram,     (Double x) -> x / 1000.0),
            new Conversion(Milligram, Kilogram, (Double x) -> x / 1_000_000.0),
            new Conversion(Milligram, Ton,      (Double x) -> x / 1_000_000_000.0),
            new Conversion(Milligram, OUNCE,    (Double x) -> x * 0.00003527396),
            new Conversion(Milligram, LB,       (Double x) -> x * 0.0000022046226),

            new Conversion(Gram, Milligram, (Double x) -> x * 1000.0),
            new Conversion(Gram, Kilogram,  (Double x) -> x / 1000.0),
            new Conversion(Gram, Ton,       (Double x) -> x / 1_000_000.0),
            new Conversion(Gram, OUNCE,     (Double x) -> x * 0.03527396),
            new Conversion(Gram, LB,        (Double x) -> x * 0.00220462),

            new Conversion(Kilogram, Milligram, (Double x) -> x * 1_000_000.0),
            new Conversion(Kilogram, Gram,      (Double x) -> x * 1000.0),
            new Conversion(Kilogram, Ton,       (Double x) -> x / 1000.0),
            new Conversion(Kilogram, OUNCE,     (Double x) -> x * 35.27396195),
            new Conversion(Kilogram, LB,        (Double x) -> x * 2.20462262),

            new Conversion(Ton, Milligram, (Double x) -> x * 1_000_000_000.0),
            new Conversion(Ton, Gram,      (Double x) -> x * 1_000_000.0),
            new Conversion(Ton, Kilogram,  (Double x) -> x * 1000.0),
            new Conversion(Ton, OUNCE,     (Double x) -> x * 35273.96195),
            new Conversion(Ton, LB,        (Double x) -> x * 2204.62262),

            new Conversion(OUNCE, Milligram, (Double x) -> x * 28349.5231),
            new Conversion(OUNCE, Gram,      (Double x) -> x * 28.34952),
            new Conversion(OUNCE, Kilogram,  (Double x) -> x * 0.02834952),
            new Conversion(OUNCE, Ton,       (Double x) -> x * 0.00002834952),
            new Conversion(OUNCE, LB,        (Double x) -> x * 0.0625),

            new Conversion(LB, Milligram, (Double x) -> x * 453592.37),
            new Conversion(LB, Gram,      (Double x) -> x * 453.59237),
            new Conversion(LB, Kilogram,  (Double x) -> x * 0.45359237),
            new Conversion(LB, Ton,       (Double x) -> x * 0.00045359237),
            new Conversion(LB, OUNCE,     (Double x) -> x * 16.0)
    ));

    public WeightConversions() {}
}
