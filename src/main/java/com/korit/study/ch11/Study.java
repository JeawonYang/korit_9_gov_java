package com.korit.study.ch11;

public class Study {
    Subject subject;
    Student[] students;

    // 생성자에 subject와 students를 전달받는다
    public Study(Subject subject, Student[] students) {
        this.subject = subject;
        this.students = students;
    }
}

