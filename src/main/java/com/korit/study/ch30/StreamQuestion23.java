package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion23 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );
        List<String> dot = emails.stream()
                .filter(mail -> mail.endsWith("@gmail.com"))
                .collect(Collectors.toList());
        System.out.println(dot);
    }
}

