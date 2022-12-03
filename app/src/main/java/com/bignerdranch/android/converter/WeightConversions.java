package com.bignerdranch.android.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightConversions {
    public static final String OUNCE  = "OUNCE";
    public static final String CUP = "CUP";
    public static final String PINT = "PINT";

    // These are the available weight units
    public String[] values = new String[]{
            // Important: this list should include all of the variables defined above.
            OUNCE,
            CUP,
            PINT
    };

    public List<Conversion> conversions = new ArrayList<>(Arrays.asList(
            new Conversion(PINT, CUP, (Double x) -> x * 2),
            // In 1 PINT there are 2 CUP
            // So with x PINT return that the number of CUP is x * 2

            // Again, there are 2 CUP in 1 PINT
            // If you have x CUP, then the number of PINT you have is x / 2
            new Conversion(CUP, PINT, (Double x) -> x / 2),

            new Conversion(CUP, OUNCE, (Double x) -> x * 8),
            new Conversion(OUNCE, CUP, (Double x) -> x / 8)

    ));

    public WeightConversions() {}
}