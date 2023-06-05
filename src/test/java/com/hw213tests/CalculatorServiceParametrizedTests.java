package com.hw213tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParametrizedTests {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> paramsForTests() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(10, 10),
                Arguments.of(62, 42),
                Arguments.of(2, 50),
                Arguments.of(61, 2),
                Arguments.of(42, 56)
        );
    }


    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void plusMethodReturnCorrectResult(int num1, int num2) {
        var actual = calculatorService.plus(num1,num2);
        var expected = num1+num2;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void minusMethodReturnCorrectResult(int num1, int num2) {
        var actual = calculatorService.minus(num1,num2);
        var expected = num1-num2;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void multiplyMethodReturnCorrectResult(int num1, int num2) {
        var actual = calculatorService.multiply(num1,num2);
        var expected = num1*num2;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void divideMethodReturnCorrectResult(int num1, int num2) {
        var actual = calculatorService.divide(num1,num2);
        var expected = (double) num1 / (double) num2;
        Assertions.assertEquals(actual, expected);
    }


}
