package com.korit.study.ch06;

public class star {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.printf("\n ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
        }
        System.out.printf("\n ==================================");
        System.out.println();
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
    //        for (int j = 0; j < (i < 2 ? i : i < n - 1 ? 1 : n - 1 - i); j++) {
    //            System.out.print(" ");
    //           }
            System.out.print(i == 0 || i == n - 1 ? "" : " ");
            for (int j = 0; j < i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.printf("\n ==================================");
        System.out.println();

        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2 ) + 1);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);
        }
    }
}
