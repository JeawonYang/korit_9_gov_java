package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamQuestion24 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("김철수", 25),
                new Person("이영희", 17),
                new Person("박민수", 30),
                new Person("정지원", 16),
                new Person("최수현", 22)
        );
        List<String> adult = people.stream()
                .filter(P -> P.getAge() > 19)
                .map(Person :: getName)
                .collect(Collectors.toList());
        System.out.println(adult);
    }
}
