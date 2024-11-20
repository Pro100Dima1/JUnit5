package org.example;

public class Main {
    public static void main(String[] args) {
        Calc resultOfCalc = new Calc();
        System.out.println("Итог сложения = " + resultOfCalc.summation(2, 5));
        Calc resultOfSubstraction = new Calc();
        System.out.println("Итог вычетания = " + resultOfSubstraction.subtraction(2, 5));
    }
}