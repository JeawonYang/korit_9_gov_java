package com.korit.study.ch06;

public class 연습문제6 {
    public static void main(String[] args) {
        printInfo("김준일", 32, "부경대");
        printInfo("김준일", 32);
        printInfo("김준일");
        // 이름만 출력하는 함수
    }
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }
    public static void printInfo(String name, int age) {
        printInfo(name);
        System.out.println("나이: " + age);
    }
    public static void printInfo(String name, int age, String school) {
        printInfo(name,age);
        System.out.println("학교: " + school);
    }
}
