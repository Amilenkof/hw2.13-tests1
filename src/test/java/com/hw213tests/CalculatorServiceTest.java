package com.hw213tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//expected - ожидаемый результат,
//        actual - действительный результат выполнения программы.

public class CalculatorServiceTest {
    //plusTests
    @Test
    public void plusShouldReturn10() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.plus(5, 5);
        String expected = "5+5=10";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void plusShouldReturn20() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.plus(10, 10);
        String expected = "10+10=20";
        Assertions.assertEquals(actual, expected);
    }

    //minusTests
    @Test
    public void minusShouldReturn0() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.minus(5, 5);
        String expected = "5-5=0";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void minusShouldReturn20() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.minus(62, 42);
        String expected = "62-42=20";
        Assertions.assertEquals(actual, expected);
    }
    //MultiplyTests
    @Test
    public void multiplyShouldReturn100() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.multuply(2,50);
        String expected = "2*50=100,00";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void multiplyShouldReturn62() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.multuply(62, 1);
        String expected = "62*1=62,00";
        Assertions.assertEquals(actual, expected);
    }
    //divideTests
    @Test
    public void divideShouldReturn075() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.divide(42,56);
        String expected = "42/56=0,75";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void divideShouldReturn62() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        String actual = calculatorService.divide(365, 12);
        String expected = "365/12=30,42";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void divideShouldThrowIllegalArgumetException() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(365, 0));
    }
}
