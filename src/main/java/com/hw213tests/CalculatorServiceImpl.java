package com.hw213tests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


//    @Value("${valueGretings}")
    @Override
    public String greetings(String str) {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(int num1, int num2) {
        return num1 +"+"+num2 +"=" + (num1+num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 +"-"+num2 +"=" + (num1-num2);
    }

    @Override
    public String divide(int num1, int num2) {
        return String.format(" %s/%s=%.2f",num1,num2,(double)(num1/num2));
    }
    @Override
    public String multuply(int num1, int num2) {
        return String.format(" %s*%s=%.2f",num1,num2,(double)(num1*num2));
    }
}
