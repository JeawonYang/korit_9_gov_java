package com.korit.study.ch07;

import java.util.Random;

public class RandomLottoNumber {
    public static void printNumAll(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("등록된 번호가 없습니다.");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("추첨된 번호(" + (i + 1) + ") : " + numbers[i]);
            }
        }
    }

    // 배열에 값 추가
    public static int[] addToArray(int value, int[] currentArray) {
        int[] newArray = new int[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    // 복권 번호 무작위 생성 (1 ~ 45)
    public static int getRandomLottoNumber() {
        return (int) (Math.random() * 45) + 1;
    }

    // 랜덤 번호를 배열에 추가
    public static int[] addRandomNumberToArray(int[] numbers) {
        int randomNumber = getRandomLottoNumber();
        return addToArray(randomNumber, numbers);
    }

    // 메인 함수
    public static void main(String[] args) {
        int[] numbers = new int[0];

        printNumAll(numbers);

        // 6개의 번호 생성
        for (int i = 0; i < 6; i++) {
            numbers = addRandomNumberToArray(numbers);
            printNumAll(numbers);
        }
    }
}