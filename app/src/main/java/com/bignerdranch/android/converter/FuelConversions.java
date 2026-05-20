package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuelConversions {
    public static final String BARREL    = "Barrel (US)";
    public static final String GALLON_US = "Gallon (US)";
    public static final String GALLON_UK = "Gallon (UK)";
    public static final String LITER     = "Liter";
    public static final String QUART     = "Quart (US)";

    public String[] values = new String[]{
            LITER, GALLON_US, GALLON_UK, QUART, BARREL
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(BARREL, GALLON_US, (Double x) -> x * 42.0),
            new Conversion(BARREL, GALLON_UK, (Double x) -> x * 34.9723),
            new Conversion(BARREL, LITER,     (Double x) -> x * 158.987295),
            new Conversion(BARREL, QUART,     (Double x) -> x * 168.0),

            new Conversion(GALLON_US, BARREL,    (Double x) -> x / 42.0),
            new Conversion(GALLON_US, GALLON_UK, (Double x) -> x * 0.832674),
            new Conversion(GALLON_US, LITER,     (Double x) -> x * 3.785412),
            new Conversion(GALLON_US, QUART,     (Double x) -> x * 4.0),

            new Conversion(GALLON_UK, BARREL,    (Double x) -> x * 0.0285941),
            new Conversion(GALLON_UK, GALLON_US, (Double x) -> x * 1.200950),
            new Conversion(GALLON_UK, LITER,     (Double x) -> x * 4.546092),
            new Conversion(GALLON_UK, QUART,     (Double x) -> x * 4.803800),

            new Conversion(LITER, BARREL,    (Double x) -> x * 0.00628981),
            new Conversion(LITER, GALLON_US, (Double x) -> x * 0.264172),
            new Conversion(LITER, GALLON_UK, (Double x) -> x * 0.219969),
            new Conversion(LITER, QUART,     (Double x) -> x * 1.056688),

            new Conversion(QUART, BARREL,    (Double x) -> x / 168.0),
            new Conversion(QUART, GALLON_US, (Double x) -> x * 0.25),
            new Conversion(QUART, GALLON_UK, (Double x) -> x * 0.208169),
            new Conversion(QUART, LITER,     (Double x) -> x * 0.946353)
    ));

    public FuelConversions() {}
}
