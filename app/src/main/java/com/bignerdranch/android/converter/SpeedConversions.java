package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeedConversions {
    public static final String MPH  = "Miles per Hour";
    public static final String KPH  = "Kilometers per Hour";
    public static final String MPS  = "Meters per Second";
    public static final String FPS  = "Feet per Second";
    public static final String KNOT = "Knot";

    public String[] values = new String[]{
            KPH, MPH, MPS, FPS, KNOT
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(MPH, KPH,  (Double x) -> x * 1.609344),
            new Conversion(MPH, MPS,  (Double x) -> x * 0.44704),
            new Conversion(MPH, FPS,  (Double x) -> x * 1.466667),
            new Conversion(MPH, KNOT, (Double x) -> x * 0.868976),

            new Conversion(KPH, MPH,  (Double x) -> x * 0.621371),
            new Conversion(KPH, MPS,  (Double x) -> x * 0.277778),
            new Conversion(KPH, FPS,  (Double x) -> x * 0.911344),
            new Conversion(KPH, KNOT, (Double x) -> x * 0.539957),

            new Conversion(MPS, MPH,  (Double x) -> x * 2.236936),
            new Conversion(MPS, KPH,  (Double x) -> x * 3.6),
            new Conversion(MPS, FPS,  (Double x) -> x * 3.28084),
            new Conversion(MPS, KNOT, (Double x) -> x * 1.943844),

            new Conversion(FPS, MPH,  (Double x) -> x * 0.681818),
            new Conversion(FPS, KPH,  (Double x) -> x * 1.09728),
            new Conversion(FPS, MPS,  (Double x) -> x * 0.3048),
            new Conversion(FPS, KNOT, (Double x) -> x * 0.592484),

            new Conversion(KNOT, MPH, (Double x) -> x * 1.150779),
            new Conversion(KNOT, KPH, (Double x) -> x * 1.852),
            new Conversion(KNOT, MPS, (Double x) -> x * 0.514444),
            new Conversion(KNOT, FPS, (Double x) -> x * 1.687810)
    ));

    public SpeedConversions() {}
}
