package com.swissre.parasuram.string.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroOnEmptyString(){
        Assertions.assertEquals(0,StringCalculator.add(""));
    }
    @Test
    public void shouldReturnZeroOnNullString(){
        Assertions.assertEquals(0,StringCalculator.add(null));
    }
    @Test
    public void shouldReturnNumberOnSingleNumberStringInput(){
        Assertions.assertEquals(7,StringCalculator.add("7"));
    }
    @Test
    public void shouldReturnSumOnTwoNumberWithCommaDelimiter(){
        Assertions.assertEquals(10,StringCalculator.add("7,3"));
    }
    @Test
    public void shouldReturnSumOnMultipleNumbersWithCommaDelimiter(){
        Assertions.assertEquals(10,StringCalculator.add("5,3,2"));
        Assertions.assertEquals(10,StringCalculator.add("3,2,3,2"));
        Assertions.assertEquals(10,StringCalculator.add("1,2,2,3,2"));
    }
}
