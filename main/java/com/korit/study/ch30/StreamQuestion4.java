package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion4 {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList
                (100.0, 200.0, 150.0, 300.0);

        List<Double> tax = prices.stream()
                .map(price -> (price + (price * 0.1)))
                .collect(Collectors.toList());
        System.out.println(tax);
    }
}
