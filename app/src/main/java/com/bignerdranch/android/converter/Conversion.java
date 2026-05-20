package com.bignerdranch.android.converter;


import androidx.arch.core.util.Function;

public class Conversion {

    public final String startUnit;
    public final String endUnit;
    public final Function<Double, Double> conversionFunction;

    public Conversion(
            String startUnit,
            String endUnit,
            Function<Double, Double> conversionFunction
            ) {
        this.startUnit = startUnit;
        this.endUnit = endUnit;
        this.conversionFunction = conversionFunction;

    }
}
