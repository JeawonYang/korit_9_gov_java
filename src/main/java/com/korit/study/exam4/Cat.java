package com.korit.study.exam4;

public class Cat extends Animal implements Soundable{
    void printinfo() {
        System.out.println("이름 : 김애용 " + " 나이 : 5살");
    }

    void move() {
        System.out.println("걷습니다");
    }
    public void sound() {
        System.out.println("야옹");
    }
}
