package com.hw213tests;

import org.springframework.beans.factory.annotation.Value;

public interface CalculatorService {


//    @Value("${valueGretings}")
    String greetings(String str);

    String plus(int num1, int num2);

    String minus(int num1, int num2);


    String divide(int num1, int num2);

    String multuply(int num1, int num2);
}
