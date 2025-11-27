package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion8 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");

        List<String> firstIndex = cities.stream()
                .map(city -> city.substring(0,1))
                .collect(Collectors.toList());
        System.out.println(firstIndex);
    }
}
