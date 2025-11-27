package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion26 {
    public static void main(String[] args) {
        List<String> articles = Arrays.asList(
                "Java 프로그래밍 기초",
                "Python으로 배우는 머신러닝",
                "Java Stream API 완벽 가이드",
                "JavaScript 최신 기능",
                "Java Spring Boot 실전",
                "React 입문 강좌"
        );
        List<String> Java = articles.stream()
                .filter(java -> java.startsWith("Java"))
                .collect(Collectors.toList());
        System.out.println(Java);
    }
}
