package com.korit.study.ch04;

import java.util.Scanner;

public class Controller07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDan = scanner.nextInt();
        int endDan = scanner.nextInt();
        int danRange = endDan - startDan + 1;


        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        for (int i = 0; i < danRange; i++) {
            int dan = (endDan - i);
            System.out.println(dan + "단");
            for (int j = 0; j < 9; j++) {
                int num = 9 - j;
                System.out.println(String.format("%d x %d = %d",dan, num, dan * num));
            }
            }
        }
    }

