package com.korit.study.ch06;

public class 연습문제2 {
    public static void main(String[] args) {
        helloName("양재원");
    }
    // 매개변수 있음, 리턴값 없음
    // 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
    public static void helloName (String name) {
        System.out.println("안녕하세요," + name + "님!");
    }
}
