package com.korit.study.ch20;

public class StaticMain {
    public static void main(String[] args) {
        StaticStudy staticStudy = new StaticStudy();
        StaticStudy.print("김준일");
        StaticStudy.print("김준이");
        staticStudy.age = 10;
        System.out.println(staticStudy.age);
        System.out.println(staticStudy.age2);
        StaticStudy.age2  = 20;
        System.out.println(StaticStudy.age2);
        staticStudy.age2 = 30;
        System.out.println(StaticStudy.age2);
        StaticStudy s2 = new StaticStudy();
        s2.age = 50;
        System.out.println(staticStudy.age2);
    }
}

