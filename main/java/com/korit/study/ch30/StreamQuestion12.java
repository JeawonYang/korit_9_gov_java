package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion12 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );
        List<String> domain = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1 ))
                .collect(Collectors.toList());
        System.out.println(domain);

        List<String> domain2 = emails.stream()
                .map(email -> email.substring(email.indexOf(".") + 1 ))
                .collect(Collectors.toList());
        System.out.println(domain2);

        List<String> domain3 = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1 ,(email.indexOf(".") + 1 )))
                .collect(Collectors.toList());
        System.out.println(domain3);
    }
}
