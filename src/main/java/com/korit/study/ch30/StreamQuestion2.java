package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList
                (1, 2, 3, 4, 5);

        List<Integer> nums = numbers.stream()
                .map(number -> (int)(Math.pow(number, 2)))
                .collect(Collectors.toList());
        System.out.println(nums);
    }
}
