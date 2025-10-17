package com.korit.study.ch06;

import java.util.Date;

public class 연습문제4 {
    public static void main(String[] args) {
        String result =isNowTime(11,40);
        System.out.println(isNowTime(11,45));

    }
    public static String isNowTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();
        return hours == nowHours && minutes == nowMinutes ?  "현재 시간입니다." : "현재 시간이 아닙니다.";
    }
}
