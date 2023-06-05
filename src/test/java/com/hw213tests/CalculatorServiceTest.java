package com.hw213tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//expected - ожидаемый результат,
//        actual - действительный результат выполнения программы.

public class CalculatorServiceTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();


    //plusTests
    @Test
    public void plusShouldReturn10() {
        var actual = calculatorService.plus(5, 5);
        var expected = 10;
        assertEquals(actual, expected);
    }
    @Test
    public void plusShouldReturn20() {
        var actual = calculatorService.plus(10, 10);
        var expected = 20;
        assertEquals(actual, expected);
    }

    //minusTests
    @Test
    public void minusShouldReturn0() {
        var actual = calculatorService.minus(5, 5);
        var expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void minusShouldReturn20() {
        var actual = calculatorService.minus(62, 42);
        var expected = 20;
        assertEquals(actual, expected);
    }
    //MultiplyTests
    @Test
    public void multiplyShouldReturn100() {
        var actual = calculatorService.multiply(2,50);
        var expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void multiplyShouldReturn62() {
        var actual = calculatorService.multiply(62, 1);
        var expected = 62;
        assertEquals(actual, expected);
    }
    //divideTests
    @Test
    public void divideShouldReturn075() {
        var actual = calculatorService.divide(42,56);
        var expected = 0.75;
        assertEquals(actual, expected);
    }
    @Test
    public void divideShouldReturn62() {
        var actual = calculatorService.divide(365, 12);
        var expected = 30.416666666666668;
        assertEquals(actual, expected);
    }
    @Test
    public void divideShouldThrowIllegalArgumetException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(365, 0));
    }
}
