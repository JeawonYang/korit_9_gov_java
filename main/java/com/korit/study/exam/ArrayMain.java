package com.korit.study.exam;

public class ArrayMain {
    public static void main(String[] args) {
        int[] nums = new int[]{85, 90, 78, 92, 88, 76, 95, 89, 70, 84};
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("합계 : " + sum);
        avg = (double) sum / 10;
        System.out.println("평균 : " + avg);
        System.out.print("평균 이상인 점수 : ");
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] >= avg) {
                System.out.print(nums[j] + " ");
            }
        }
    }
}
