package com.korit.study.ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion29 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> same = numbers.stream()
                .filter(num -> numbers.stream()
                        .filter(num2 -> num2 == num).count() == 1)
                .collect(Collectors.toList());
        System.out.println(same);

        List<Integer> same2 = new ArrayList<>();
        for (Integer num :numbers) {
            int count = 0;
            for (Integer num2 : numbers) {
                if (num2 == num) {
                    count++;
                }
            }
            if (count == 1) {
                same2.add(num);
            }
        }
        System.out.println(same2);
    }
}
