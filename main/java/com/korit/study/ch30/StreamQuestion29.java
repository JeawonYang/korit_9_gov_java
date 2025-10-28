package com.korit.study.ch30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion29 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> same = numbers.stream()
                .filter(num -> Collections.frequency(numbers, num) == 1)
                .collect(Collectors.toList());
        System.out.println(same);
    }
}
