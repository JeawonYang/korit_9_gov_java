package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion6 {
    public static void main(String[] args) {
        List<String> usernames = Arrays.asList("john", "mary", "steve");

        List<String> Users = usernames.stream()
                .map(user -> "User : " + user)
                .collect(Collectors.toList());
        System.out.println(Users);
    }
}
