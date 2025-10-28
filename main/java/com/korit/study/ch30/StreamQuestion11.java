package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion11 {
    public static void main(String[] args) {
        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");

        List<String> trim = messyData.stream()
                .map(꺼억 -> 꺼억.trim())
                .collect(Collectors.toList());
        System.out.println(trim);
    }
}
