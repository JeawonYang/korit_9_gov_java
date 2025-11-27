package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
    String name;
    int mathScore;
    int englishScore;

    public Student1(String name, int mathScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }
}

public class StreamQuestion25 {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
                new Student1("김철수", 85, 90),
                new Student1("이영희", 92, 88),
                new Student1("박민수", 65, 70),
                new Student1("정지원", 78, 85),
                new Student1("최수현", 95, 92)
        );
        List<String> GoodStudent = students.stream()
                .filter(score -> score.getMathScore() > 80 && score.getEnglishScore() > 80)
                .map(Student1 :: getName)
                .collect(Collectors.toList());
        System.out.println(GoodStudent);
    }
}
