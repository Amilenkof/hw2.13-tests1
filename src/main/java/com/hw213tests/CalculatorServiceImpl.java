package com.hw213tests;

import com.hw213tests.exeptions.DivideOnNullExpection;
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
    public int plus(int num1, int num2) {
        return num1 + num2;
//        return num1 +"+"+num2 +"=" + (num1+num2);
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
//        return num1 +"-"+num2 +"=" + (num1-num2);
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return (double) num1 / (double) num2;


//        return String.format("%s/%s=%.2f",num1,num2,res);
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
//        return String.format("%s*%s=%.2f",num1,num2,(double)(num1*num2));
    }

}
