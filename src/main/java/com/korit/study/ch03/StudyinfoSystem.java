package com.korit.study.ch03;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StudyinfoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("나이를 입력하세요 >> ");
        int age = sc.nextInt();
        System.out.print("학년을 입력하세요 >> ");
        int grade = sc.nextInt();
        System.out.print("국어 점수를 입력하세요 >> ");
        int korean = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 >> ");
        int english = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 >> ");
        int math = sc.nextInt();
        sc.nextLine();
        System.out.print("자기소개를 입력하세요: >> ");
        String myself = sc.nextLine();

        double avg = (korean + english + math)/3.0 ;
        String credit = avg >= 90 ? "A" :
                avg >= 80 ? "B" :
                        avg >= 70 ? "C" : "D";


        System.out.println("=== 학생정보 ===");
        System.out.println(String.format("""
               이름 : %s
               나이 : %d세
               학년 : %d학년
               성적 : 
                  국어 : %d점
                  영어 : %d점
                  수학 : %d점
                  평균 : %.2f점 (학점 : %s)
               자기소개 : %s""",name, age, grade, korean, english, math, avg, credit, myself));

    }
}
