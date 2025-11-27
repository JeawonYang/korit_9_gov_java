package com.korit.study.exam4;

public class Dog extends Animal implements Soundable{
    public void printinfo() {
        System.out.println("이름 : 댕댕이 " + " 나이 : 2살");
    }

    void move () {
        System.out.println("달립니다");
    }
    public void sound() {
        System.out.println("멍멍");
    }
}
