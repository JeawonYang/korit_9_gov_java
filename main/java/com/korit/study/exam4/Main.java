package com.korit.study.exam4;

interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        Calculator subtract = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };

        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        System.out.println(x + " + " + y + " = " + add.calculate(x, y));
        System.out.println(x + " - " + y + " = " + subtract.calculate(x, y));
        System.out.println(x + " * " + y + " = " + multiply.calculate(x, y));
    }
}

