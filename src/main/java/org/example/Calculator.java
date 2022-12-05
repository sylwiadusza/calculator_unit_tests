package org.example;

public class Calculator {
    public double sum(double x, double y){
        return x + y;
    }
    public double subtraction(double x, double y){
        return x - y;
    }

    public double subtractionOnlyPositiveNumbers(double x, double y){
        if(x < 0) {
            return -1;
        }
        if(y < 0) {
            return -1;
        }
        return x - y;
    }
    public double multiplication(double x, double y){
        return x *y;
    }
    public double division (double x, double y){
        return x / y;
    }
}
