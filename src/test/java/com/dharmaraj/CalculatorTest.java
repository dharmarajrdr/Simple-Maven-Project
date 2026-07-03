package com.dharmaraj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2, 3);
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}
