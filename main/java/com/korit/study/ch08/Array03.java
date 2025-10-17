package com.korit.study.ch08;

import java.util.Random;

public class Array03 {
    public static void main(String[] args) {
        String[] 한식 = new String[]{"김치찌개", "불고기", "비빔밥", "된장찌개", "잡채", "갈비", "떡볶이", "삼겹살", "김밥", "순두부찌개"};
        String[] 일식 = new String[]{"스시", "라멘", "우동", "덴푸라", "오코노미야끼", "가츠동", "소바", "미소시루", "타코야끼","야키토리"};
        String[] 중식 = new String[]{"짜장면", "짬뽕", "마파두부", "볶음밥", "꿔바로우", "양장피", "춘권", "훠궈", "양념치킨"};
        String[] 양식 = new String[]{"스테이크", "파스타", "피자", "햄버거", "샐러드", "리조또", "크림스프", "바게트", "라자냐", "프렌치프라이"};
        String[] 풀때기 = new String[]{"샐러드", "샌드위치"};

        Random random = new Random();

        String[][] allFoods = {한식, 일식, 중식, 양식, 풀때기};
        String[] foodTypes = {"한식", "일식", "중식", "양식", "풀때기"};

        // 0 ~ 3 사이 랜덤 숫자 생성 (음식 종류 인덱스)
        int foodTypeIndex = random.nextInt(allFoods.length);

        // 해당 음식 종류 배열 선택
        String[] selectedFoodArray = allFoods[foodTypeIndex];

        // 해당 음식 종류 배열에서 랜덤 음식 선택
        int foodIndex = random.nextInt(selectedFoodArray.length);
        String selectedFood = selectedFoodArray[foodIndex];

        // 결과 출력
        System.out.println("오늘의 추천 메뉴는 " + foodTypes[foodTypeIndex] + " 중에서 '" + selectedFood + "'입니다!");
    }
}
