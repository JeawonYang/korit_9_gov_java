package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class StreamQuestion15 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );
        List<String> List = students.stream()
                .map(student -> {
                    int score = student.getScore();
                    String grade;

                    if (score >= 90) {
                        grade = "A";
                    } else if (score >= 80) {
                        grade = "B";
                    } else if (score >= 70) {
                        grade = "C";
                    } else {
                        grade = "D";
                    }

                    return student.getName() + ": " + grade;
                })
                .collect(Collectors.toList());

    System.out.println(List);
    }
}


