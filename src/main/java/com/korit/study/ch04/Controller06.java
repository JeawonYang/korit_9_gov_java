package com.korit.study.ch04;
import java.util.Scanner;

public class Controller06 {
    public static void main(String[] args) {
        //중첩 반복
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < i; j++) {
                System.out.println("j = " + j);
            }
        }

        /* 구구단 */
        Scanner scanner = new Scanner(System.in);
        int startDan = scanner.nextInt();
        int endDan = scanner.nextInt();

        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        for (int i = 0; i < 9; i++) {
            System.out.println("i단");
            for (int j = 0; j < i; j++) {
                System.out.println(i * j);
            }
        }

        scanner.close();
    }
}


