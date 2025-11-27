package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamQuestion5 {
    public static void main(String[] args) {

        List<Person1> peoples = Arrays.asList(
                new Person1("Alice", 25),
                new Person1("Bob", 30),
                new Person1("Charlie", 35)
        );
        List<String> Names = peoples.stream()
                .map(people -> people.getName())
                .collect(Collectors.toList());
        System.out.println(Names);
    }
}
