package com.swissre.parasuram.string.calculator;

public class StringCalculator {
    public static int add(String input) {
        if(null==input || input.isEmpty()){
            return  0;
        }else {
            return Integer.parseInt(input);
        }
    }
}
