package org.example;

public class Calculator{
    // This program calculates integer nums.

    public  Calculator(){
    }
    public int add(int a, int b){
        int c = a + b;
        return c;
    }
    public int subtract(int a, int b){
        int c = a - b;
        return c;
    }
    public int multiply(int a, int b){
        int c = a * b;
        return c;
    }
    public int divide(int a, int b){
        int c = a / b;
        return c;
    }
    public int modulo(int a, int b){
        int c = a % b;
        return c;
    }
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}
