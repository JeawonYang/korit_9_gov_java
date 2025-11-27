package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion19 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");

        List<String> length = words.stream()
                .filter(l -> 5 <= l.length())
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
