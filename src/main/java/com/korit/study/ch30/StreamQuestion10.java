package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion10 {
    public static void main(String[] args) {
        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);

        List<Double> Fahrenheit = celsius.stream()
                .map(fahrenheit -> (fahrenheit * 9/5) + 32)
                .collect(Collectors.toList());
        System.out.println(Fahrenheit);
    }
}
