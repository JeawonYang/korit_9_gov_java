package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion17 {
    public static void main(String[] args) {
        List<String> phoneNumbers = Arrays.asList(
                "01012345678",
                "01098765432",
                "01055556666",
                "01011112222"
        );
        List<String> numbers = phoneNumbers.stream()
                .map(number -> number.substring(0,3) + "-"
                        + number.substring(3,7) + "-"
                        + number.substring(7))
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
