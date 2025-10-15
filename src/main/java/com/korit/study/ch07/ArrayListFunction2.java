package com.korit.study.ch07;

import java.util.Scanner;
public class ArrayListFunction2 {

    public static void printNumAll(int[] numbers) {
        if (numbers.length == 0) { System.out.println("등록된 숫자가 없습니다.");
        } else { for (int i = 0; i < numbers.length; i++) {
            System.out.println("입력한 번호(" + i + ") : " + numbers[i]);
        }
        }
    }

    public static int[] addToArray(int value,int[] currentArray){
        int[] NewArray = new int[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            NewArray[i] = currentArray[i];
        }
        NewArray[NewArray.length - 1] = value;
        return NewArray;
    }

    public static int InputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("복권 번호 입력 : ");

        return sc.nextInt();
    }

    public static int[] addInputNameToNames(int[] Numbers) {
        int Number= InputNumber();
        return addToArray(Number, Numbers);
    }

    public static void main (String[]args){
        int[] Numbers = new int[0];
        printNumAll(Numbers);
        Numbers = addInputNameToNames(Numbers);
        Numbers = addInputNameToNames(Numbers);
        Numbers = addInputNameToNames(Numbers);
        Numbers = addInputNameToNames(Numbers);
        Numbers = addInputNameToNames(Numbers);
        Numbers = addInputNameToNames(Numbers);
        printNumAll(Numbers);
    }
}















