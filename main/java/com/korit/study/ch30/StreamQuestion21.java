package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion21 {
    public static void main(String[] args) {
        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);

        List<Integer> Pnumber = mixedNumbers.stream()
                .filter(P -> P >= 0)
                .collect(Collectors.toList());
        System.out.println(Pnumber);
    }
}
