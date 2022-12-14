package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeedConversions {
    public static final String MILE_PER_HOUR = "Miles Per Hour";
    public static final String KILOMETERS_PER_HOUR = "Kilometers Per Hour";
    public static final String METER_PER_HOUR = "Meter Per Hour";
    public static final String CENTIMETER_PER_HOUR = "Centimeter Per Hour";
    public static final String METER_PER_SECOND = "Meter Per Second";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            MILE_PER_HOUR,
            KILOMETERS_PER_HOUR,
            METER_PER_HOUR,
            CENTIMETER_PER_HOUR,
            METER_PER_SECOND

    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(CENTIMETER_PER_HOUR, METER_PER_HOUR , (Double x) -> x * 0.01),
            new Conversion(CENTIMETER_PER_HOUR, KILOMETERS_PER_HOUR, (Double x) -> x * 0.00001),
            new Conversion(CENTIMETER_PER_HOUR, MILE_PER_HOUR, (Double x) -> x * 0.00000621),
            new Conversion(CENTIMETER_PER_HOUR, METER_PER_SECOND, (Double x) -> x * 0.000002778),
            new Conversion(METER_PER_HOUR, CENTIMETER_PER_HOUR, (Double x) -> x * 100),
            new Conversion(METER_PER_HOUR, KILOMETERS_PER_HOUR, (Double x) -> x * 0.001),
            new Conversion(METER_PER_HOUR, MILE_PER_HOUR, (Double x) -> x * 0.00062137),
            new Conversion(METER_PER_HOUR, METER_PER_SECOND, (Double x) -> x * 0.0002778),
            new Conversion(KILOMETERS_PER_HOUR, CENTIMETER_PER_HOUR, (Double x) -> x * 100000),
            new Conversion(KILOMETERS_PER_HOUR, METER_PER_HOUR, (Double x) -> x * 1000),
            new Conversion(KILOMETERS_PER_HOUR, MILE_PER_HOUR, (Double x) -> x * 0.62137119),
            new Conversion(KILOMETERS_PER_HOUR, METER_PER_SECOND, (Double x) -> x * 0.27777778),
            new Conversion(MILE_PER_HOUR, CENTIMETER_PER_HOUR, (Double x) -> x * 160934.4),
            new Conversion(MILE_PER_HOUR, KILOMETERS_PER_HOUR, (Double x) -> x * 1.609344),
            new Conversion(MILE_PER_HOUR, METER_PER_HOUR, (Double x) -> x * 1609.344),
            new Conversion(MILE_PER_HOUR, METER_PER_SECOND, (Double x) -> x * 0.44704),
            new Conversion(METER_PER_SECOND, CENTIMETER_PER_HOUR, (Double x) -> x * 360000),
            new Conversion(METER_PER_SECOND, METER_PER_HOUR, (Double x) -> x * 3600),
            new Conversion(METER_PER_SECOND, KILOMETERS_PER_HOUR, (Double x) -> x * 3.6),
            new Conversion(METER_PER_SECOND, MILE_PER_HOUR, (Double x) -> x * 2.23693629)

    ));

    public SpeedConversions() {}
}