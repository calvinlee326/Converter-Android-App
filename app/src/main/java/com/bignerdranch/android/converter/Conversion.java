package com.bignerdranch.android.converter;


import androidx.arch.core.util.Function;

public class Conversion {

    public String startUnit;
    public String endUnit;
    public Function<Double, Double> conversionFunction;

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
