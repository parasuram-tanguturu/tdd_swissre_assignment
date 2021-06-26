package com.swissre.parasuram.string.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Assumptions
// -given string contains only numbers
// -using delimiters : comma ,whitespace
public class StringCalculator {
    public static int add(String input) {
        if(null==input || input.isEmpty()){
            return  0;
        }else if(input.contains(",")) {
            return getListOfPositiveNumbersFromString(input,",").stream().reduce(0,Integer::sum);
        }else if(input.contains(" ")) {
            return  getListOfPositiveNumbersFromString(input," ").stream().reduce(0,Integer::sum);
        }else {
            return toInt(input);
        }
    }
    private static List<Integer> getListOfPositiveNumbersFromString(String input,String delimiter) {
        List<Integer> numbersList = Arrays.stream(input.split(delimiter))
                .map(StringCalculator::toInt)
                .filter(num->num<100)
                .collect(Collectors.toList());
        final List<Integer> negativeNumbersList = numbersList.stream().filter(n -> n < 0).collect(Collectors.toList());
        if(negativeNumbersList.size()>0){
            throw new RuntimeException("negative numbers not allowed : "+negativeNumbersList.stream().map(String::valueOf).collect(Collectors.joining(",")));
        }else{
            return numbersList;
        }
    }

    private static int toInt(String input) {
        return Integer.parseInt(input);
    }
}
