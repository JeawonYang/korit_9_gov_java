package com.korit.study.exam2;

public class Test {
    public static void main(String[] args) {
        Salary s1 = new Manager();
        Salary s2 = new Engineer();

        Employee e1 = new Manager();
        Employee e2 = new Engineer();

        s1.calculateBonus();
        s2.calculateBonus();

        e1.getSalary();
        e2.getSalary();

    }
}
