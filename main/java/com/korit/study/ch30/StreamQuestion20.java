package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion20 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");

        List<String> nameA = names.stream()
                .filter(A -> A.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(nameA);
    }
}
