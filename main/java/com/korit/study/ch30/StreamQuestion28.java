package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion28 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");

        List<String> NotNull = data.stream()
                .filter(not -> not != null)
                .collect(Collectors.toList());
        System.out.println(NotNull);
    }
}
