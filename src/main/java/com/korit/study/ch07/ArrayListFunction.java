package com.korit.study.ch07;

import com.sun.jdi.VMOutOfMemoryException;

import java.util.Scanner;

public class ArrayListFunction {

    public static void printNameAll(String[] names) {
        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + ") : " + names[i]);
            }
        }
    }

    public static String[] addToArray(String value,String[] currentArray){
        String[] NewArray = new String[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            NewArray[i] = currentArray[i];
        }
        NewArray[NewArray.length - 1] = value;
        return NewArray;
    }
    public static String InputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름입력 : ");

        return sc.nextLine();
    }

    public static String[] addInputNameToNames(String[] names) {
        String name= InputName();
        return addToArray(name, names);
    }

        public static void main (String[]args){
            String[] names = new String[0];

            printNameAll(names);
            names = addInputNameToNames(names);
            printNameAll(names);
            names = addInputNameToNames(names);
            printNameAll(names);
            names = addInputNameToNames(names);
            printNameAll(names);
            names = addInputNameToNames(names);
            printNameAll(names);
        }
    }





