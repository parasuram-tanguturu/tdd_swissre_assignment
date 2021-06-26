package com.swissre.parasuram.string.calculator;

public class StringCalculator {
    public static int add(String input) {
        if(null==input || input.isEmpty()){
            return  0;
        }else if(input.contains(",")) {
            final String[] nums = input.split(",");
            return Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
        }else {
            return Integer.parseInt(input);
        }
    }
}
