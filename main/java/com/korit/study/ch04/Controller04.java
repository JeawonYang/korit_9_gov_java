package com.korit.study.ch04;

import java.util.Scanner;

public class Controller04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        System.out.println("정수 6개를 입력하세요. : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even += num[i];
            }
        }for (int i = 0; i< num.length; i++) {
            if (num[i] % 2 != 0) {
                odd += num[i];
            }
        }
        System.out.println("짝수의 합 : " + even);
        System.out.println("홀수의 합 : " + odd);
    }
}