package com.korit.study.ch01;

import java.util.Scanner;

public class Print02 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = n1 + n2;
        int n4 = 20;
        long n5 = 2200000000l;
        double n6 = 30.00;
        char n7 = (int)65.55;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println((double) n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println((int) n6);
        System.out.println(n7);

        Scanner sca = new Scanner(System.in);
        int i = sca.nextInt();
            if (i % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        }



    }

