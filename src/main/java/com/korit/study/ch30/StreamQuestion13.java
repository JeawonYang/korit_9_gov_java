package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion13 {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
        int currentYear = 2024;

        List<Integer> Years = ages.stream()
                .map(year -> currentYear - year)
                .collect(Collectors.toList());
        System.out.println(Years);

    }
}
