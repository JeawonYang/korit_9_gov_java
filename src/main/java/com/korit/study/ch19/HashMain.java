package com.korit.study.ch19;

import java.util.Objects;

public class HashMain {
    // hash(해시)란 key, value의 한 쌍을 통해 데이터를 표현하는 기법
    // key : 중복 불가능  (ex : 주민등록번호)
    // value : 중복가능 (ex :이름
    public static void main(String[] args) {
        String name1 = "ㄱ";
        String name2 = new String("김준일");

        int age1 = 10;
        int age2 = 10;

        int hashkey1 = Objects.hash(name1);
        int hashkey2 = Objects.hash(name2);
        int hashkey3 = Objects.hash(age1);
        int hashkey4 = Objects.hash(age2);

        System.out.println(hashkey1);
        System.out.println(hashkey2);
        System.out.println(hashkey3);
        System.out.println(hashkey4);

    }
}
