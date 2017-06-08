package com.cts.template.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorUtilTest {

    private CalculatorUtil sample ;

    @Test
    public void thatGotSumValueWhenPassingPlusActionCodeAndValues(){
        int expected = 10;
        sample = new CalculatorUtil();
        int actual = sample.calculate(1,5,5);
        assertEquals(expected, actual);
    }

    @Test
    public void thatGotSubtractedValueWhenPassingMinusActionCodeAndValues(){
        int expected = 4;
        sample = new CalculatorUtil();
        int actual = sample.calculate(2,5,1);
        assertEquals(expected, actual);
    }

}