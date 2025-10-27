package com.korit.study.ch28;

import java.util.concurrent.atomic.AtomicInteger;

public class AnonymousClassMain {
    public static void main(String[] args) {
        AnonymousClass a = new AnonymousClassImpl();
        a.fx1();
        System.out.println(a.fx2());

        int num = 10;
        AtomicInteger num2 = new AtomicInteger(10);

        /*
            익명클래스 사용하는 이유  -
            1. 딱 한번만 쓰고 말 때 (굳이 클래스가 필요없을 때) -> 일회용
            2. 메서드 안에 클래스를 정의하는 행위는 할 수 없다

            ==> 인터페이스나 추상 클래스를 구현

            Atomic : 멀티스레드 환경에서 안전하게 변수 값을 변경하기 위한 클래스.
            ==> 중단 없이 한 번에 수행되는 연산 (동시성)


            AnonymousClass는 Atomic이랑 함께 사용하기
            -> Anonymous는 실행 도중에 만들기 때문에 thread 문제가 터짐 .
         */

        AnonymousClass b = new AnonymousClass() {
            @Override
            public void fx1() {

                System.out.println(num);
                num2.set(num2.get() + 10);
            }

            @Override
            public int fx2() {
                return 0;
            }
        };
    }
}
