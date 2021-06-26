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
}
