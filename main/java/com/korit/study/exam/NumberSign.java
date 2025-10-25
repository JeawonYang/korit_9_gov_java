package com.korit.study.exam;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1 % 2 == 0 && num1 > 0) {
            System.out.println("짝수입니다");
        } else if (num1 % 2 != 0 && num1 > 0) {
            System.out.println("홀수입니다");
        } else if (num1 < 0){
            System.out.println("음수입니다.");
        } else {
            System.out.println(0);
        }
    }
}
