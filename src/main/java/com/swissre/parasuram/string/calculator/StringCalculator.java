package com.swissre.parasuram.string.calculator;

import java.util.Arrays;

public class StringCalculator {
    public static int add(String input) {
        if(null==input || input.isEmpty()){
            return  0;
        }else if(input.contains(",")) {
            final String[] nums = input.split(",");
            return Arrays.stream(nums)
                    .map(StringCalculator::toInt)
                    .reduce(0, Integer::sum);
        }else {
            return toInt(input);
        }
    }

    private static int toInt(String input) {
        return Integer.parseInt(input);
    }
}
