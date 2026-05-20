package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeConversions {
    public static final String MILLISECOND = "Millisecond";
    public static final String SECOND      = "Second";
    public static final String MINUTE      = "Minute";
    public static final String HOUR        = "Hour";
    public static final String DAY         = "Day";
    public static final String WEEK        = "Week";

    public String[] values = new String[]{
            MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(MILLISECOND, SECOND, (Double x) -> x / 1000.0),
            new Conversion(MILLISECOND, MINUTE, (Double x) -> x / 60000.0),
            new Conversion(MILLISECOND, HOUR,   (Double x) -> x / 3_600_000.0),
            new Conversion(MILLISECOND, DAY,    (Double x) -> x / 86_400_000.0),
            new Conversion(MILLISECOND, WEEK,   (Double x) -> x / 604_800_000.0),

            new Conversion(SECOND, MILLISECOND, (Double x) -> x * 1000.0),
            new Conversion(SECOND, MINUTE,      (Double x) -> x / 60.0),
            new Conversion(SECOND, HOUR,        (Double x) -> x / 3600.0),
            new Conversion(SECOND, DAY,         (Double x) -> x / 86400.0),
            new Conversion(SECOND, WEEK,        (Double x) -> x / 604800.0),

            new Conversion(MINUTE, MILLISECOND, (Double x) -> x * 60000.0),
            new Conversion(MINUTE, SECOND,      (Double x) -> x * 60.0),
            new Conversion(MINUTE, HOUR,        (Double x) -> x / 60.0),
            new Conversion(MINUTE, DAY,         (Double x) -> x / 1440.0),
            new Conversion(MINUTE, WEEK,        (Double x) -> x / 10080.0),

            new Conversion(HOUR, MILLISECOND, (Double x) -> x * 3_600_000.0),
            new Conversion(HOUR, SECOND,      (Double x) -> x * 3600.0),
            new Conversion(HOUR, MINUTE,      (Double x) -> x * 60.0),
            new Conversion(HOUR, DAY,         (Double x) -> x / 24.0),
            new Conversion(HOUR, WEEK,        (Double x) -> x / 168.0),

            new Conversion(DAY, MILLISECOND, (Double x) -> x * 86_400_000.0),
            new Conversion(DAY, SECOND,      (Double x) -> x * 86400.0),
            new Conversion(DAY, MINUTE,      (Double x) -> x * 1440.0),
            new Conversion(DAY, HOUR,        (Double x) -> x * 24.0),
            new Conversion(DAY, WEEK,        (Double x) -> x / 7.0),

            new Conversion(WEEK, MILLISECOND, (Double x) -> x * 604_800_000.0),
            new Conversion(WEEK, SECOND,      (Double x) -> x * 604800.0),
            new Conversion(WEEK, MINUTE,      (Double x) -> x * 10080.0),
            new Conversion(WEEK, HOUR,        (Double x) -> x * 168.0),
            new Conversion(WEEK, DAY,         (Double x) -> x * 7.0)
    ));

    public TimeConversions() {}
}
