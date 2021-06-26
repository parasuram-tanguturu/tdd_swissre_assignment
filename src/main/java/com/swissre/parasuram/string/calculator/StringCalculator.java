package com.swissre.parasuram.string.calculator;

public class StringCalculator {
    public static int add(String input) {
        if(null==input || input.isEmpty()){
            return  0;
        }else if(input.contains(",")) {
            final String[] nums = input.split(",");
            return toInt(nums[0]) + toInt(nums[1]);
        }else {
            return toInt(input);
        }
    }

    private static int toInt(String input) {
        return Integer.parseInt(input);
    }
}
