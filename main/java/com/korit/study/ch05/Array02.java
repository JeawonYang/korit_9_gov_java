package com.korit.study.ch05;

public class Array02 {
    public static void main(String[] args) {

        /* ### **문제 1: 배열의 모든 요소 출력**
        정수형 배열`{10, 20, 30, 40, 50}`의 모든 요소를 한 줄에 하나씩 출력하는 프로그램을 작성하세요. */

        System.out.println("=========================================================");
        System.out.println("1번 문제");

        int num1 [] = new int[5];
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        num1[3] = 40;
        num1[4] = 50;

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
        /*### **문제 2: 배열 요소들의 합계 구하기**
        정수형 배열`{5, 10, 15, 20, 25}`의 모든 요소의 합을 구해서 출력하는 프로그램을 작성하세요. */

        System.out.println("=========================================================");
        System.out.println("2번 문제");

        int num2 [] = new int[5];
        num2[0] = 5;
        num2[1] = 10;
        num2[2] = 15;
        num2[3] = 20;
        num2[4] = 25;

        for (int i = 0; i < num2.length; i++) {
        }
        int sum = num2[0] + num2[1] + num2[2] + num2[3] + num2[4];
        System.out.println("배열 요소들의 합 = " + sum);


        /*### **문제 3: 배열에서 최댓값 찾기**
         정수형 배열`{23, 45, 12, 67, 34, 89, 11}`에서 가장 큰 값을 찾아서 출력하는 프로그램을 작성하세요. */

        System.out.println("=========================================================");
        System.out.println("3번 문제");

        int num3 [] = new int[7];

        num3[0] = 23;
        num3[1] = 45;
        num3[2] = 12;
        num3[3] = 67;
        num3[4] = 34;
        num3[5] = 89;
        num3[6] = 11;

        int max = num3[0];
        int min = num3[0];

        for (int i = 0; i < num3.length; i++) {
            if (num3[i] > max) {
                max = num3[i];
            } else if (num3[i] < min) {
                min = num3[i];
            }
        }
        System.out.println("배열의 최댓값 : " + max);
        System.out.println("배열의 최소값 : " + min);

        /* ### **문제 4: 배열의 짝수만 출력**
        정수형 배열`{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`에서 짝수만 찾아서 출력하는 프로그램을 작성하세요. */

        System.out.println("=========================================================");
        System.out.println("4번 문제");

        int num4 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("짝수: ");
        for (int i = 0; i < num4.length; i++) {
            if (num4[i] % 2 == 0) {
                System.out.print(" "+ num4[i]);
            }
        }

        /* ### **문제 5: 배열 역순으로 출력**
        정수형 배열`{1, 2, 3, 4, 5}`의 요소를 역순으로 출력하는 프로그램을 작성하세요.  */

        System.out.println("\n" + "=========================================================");
        System.out.println("6번 문제");

        int num5 [] = {1, 2, 3, 4, 5};

        for (int i = num5.length -1; i>= 0; i--) {
            System.out.println(num5[i]);
        }

        /* ### **문제 6: 특정 값 개수 세기**
        정수형 배열`{3, 7, 3, 9, 3, 1, 3, 5}`에서 숫자 3이 몇 개 있는지 세는 프로그램을 작성하세요. */

        System.out.println("=========================================================");
        System.out.println("7번 문제");

        int num6 [] = {3, 7, 3, 9, 3, 1, 3, 5};
        int count = 0;

        for (int i = 0; i < num6.length; i++) {
            if (num6[i] == 3) {
                count++;
            }
        }
        System.out.println("3의 개수: " + count);

        /* ### **문제 7: 배열의 평균 구하기**
        정수형 배열`{80, 90, 75, 85, 95}`의 평균값을 구해서 소수점 둘째 자리까지 출력하는 프로그램을 작성하세요. */

        int num7 [] = new int [5];
        num7[0] = 80;
        num7[1] = 90;
        num7[2] = 75;
        num7[3] = 85;
        num7[4] = 95;

        double sum1 = 0;
        double avg = (num7[0] + num7[1] + num7[2] + num7[3] + num7[4]) /5;
        System.out.printf("%.2f\n",avg);


        /* ### **문제 8: 두 배열의 합 만들기**
         두 개의 정수형 배열`arr1 = {1, 2, 3, 4, 5}`,`arr2 = {6, 7, 8, 9, 10}`이 있을 때, 같은 인덱스의 요소들을 더한 새로운 배열을 만들어 출력하는 프로그램을 작성하세요. */

        int arr1[] = {1, 2, 3, 4, 5};
    }
}
