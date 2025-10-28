package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion9 {
    public static void main(String[] args) {
        List<Boolean> flags = Arrays.asList(true, false, true, true, false);

        List<Boolean> Reverse = flags.stream()
                .map(flag -> ! flag)
                .collect(Collectors.toList());
        System.out.println(Reverse);
    }
}
