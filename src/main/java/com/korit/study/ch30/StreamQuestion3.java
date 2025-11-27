package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList
                ("Java", "Stream", "API", "Programming");

        List<Integer> length = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
