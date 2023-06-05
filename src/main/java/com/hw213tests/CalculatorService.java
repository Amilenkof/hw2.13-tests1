package com.hw213tests;

import org.springframework.beans.factory.annotation.Value;

public interface CalculatorService {


//    @Value("${valueGretings}")
    String greetings(String str);

    int plus(int num1, int num2);

    int minus(int num1, int num2);


    double divide(int num1, int num2);

    int multiply(int num1, int num2);
}
