package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준이", 33);
        System.out.println(b.name);
        System.out.println(b.age);

        ClassC c = new ClassC("김준삼", 34, "동래구");
        ClassC c2 = new ClassC();
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.address);



    }
}
