package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyConversions {
    public static final String HZ  = "Hertz";
    public static final String KHZ = "Kilohertz";
    public static final String MHZ = "Megahertz";
    public static final String GHZ = "Gigahertz";

    public String[] values = new String[]{
            HZ, KHZ, MHZ, GHZ
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(HZ, KHZ, (Double x) -> x / 1000.0),
            new Conversion(HZ, MHZ, (Double x) -> x / 1_000_000.0),
            new Conversion(HZ, GHZ, (Double x) -> x / 1_000_000_000.0),

            new Conversion(KHZ, HZ,  (Double x) -> x * 1000.0),
            new Conversion(KHZ, MHZ, (Double x) -> x / 1000.0),
            new Conversion(KHZ, GHZ, (Double x) -> x / 1_000_000.0),

            new Conversion(MHZ, HZ,  (Double x) -> x * 1_000_000.0),
            new Conversion(MHZ, KHZ, (Double x) -> x * 1000.0),
            new Conversion(MHZ, GHZ, (Double x) -> x / 1000.0),

            new Conversion(GHZ, HZ,  (Double x) -> x * 1_000_000_000.0),
            new Conversion(GHZ, KHZ, (Double x) -> x * 1_000_000.0),
            new Conversion(GHZ, MHZ, (Double x) -> x * 1000.0)
    ));

    public FrequencyConversions() {}
}
