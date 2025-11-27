package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList
                ("alice", "bob", "charlie", "david");

        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames);
    }
}
