package com.korit.study.ch06;

public class 연습문제5 {
    public static void main(String[] args) {
        int result1 = add(10, 20);
        System.out.println(result1);

        double result2 = add(10.5, 20.5);
        System.out.println(result2);

        int result3 = add(10, 20, 30);
        System.out.println(result3);
    }
    //정수 2개를 더하는 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static double add(double a, double b) {
        return (int) a + b;
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return  a + b + c;
        // 여기에 코드 작성
    }
}
