package com.korit.study.ch08;

import java.util.Scanner;

public class Array06 {
    public static String[] names = new String[] {"김밥", "떡볶이", "라면", "순대", "튀김"};

    public static void main(String[] args) {
        System.out.println("[ 상품 관리 시스템 ]");
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1 : 상품 추가");
            System.out.println("2 : 상품 검색");
            System.out.println("3 : 상품 수정");
            System.out.println("4 : 상품 삭제");
            System.out.println("0 : 종료");

            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 0) {
                isExit = true;
                System.out.println("프로그램을 종료합니다.");
            } else if (selectedNumber == 1) {
                prodectAdd();
                System.out.println("상품을 추가해주세요");
            } else if (selectedNumber == 2) {
                searchProduct();
            } else if (selectedNumber == 3) {

            }
        }
    }

    public static void add(String name) {
        String[] newArray = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newArray[i] = names[i];
        }
        newArray[newArray.length - 1] = name;
        names = newArray;
    }

    public static void prodectAdd() {
        Scanner scanner = new Scanner(System.in);
        String newName = null;
        while (true) {
            System.out.println(" [이름 추가 기능] ");
            System.out.println("이름 입력 : ");
            newName = scanner.nextLine();

            if (findByName(newName) == null) {
                break;
            }
            System.out.println("중복된 상품입니다.");
        }
        add(newName);
        System.out.println(" << 상품 추가 완료 ");
    }

    public static String findByName(String name) {
        for (String n : names) {
            if (n.equals(name)) {
                return n;
            }
        }
        return null;
    }

    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        while (true) {
            System.out.println("사용자 정보 조회.");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d) : ", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지는 찾을 수 없습니다.");
            } else {
                String[] namesOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < namesOfPagination.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, namesOfPagination[i]);
                }
                System.out.println();
            }
        }

    }

    public static int getLastPage(int size) {
        return names.length % size == 0 ? names.length / size : names.length / size + 1;
    }
    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size; // (1 - 1) * 10 => 0, (2 - 1) * 10 => 10
        int lastPage = names.length / size == 0 ? names.length / size : names.length / size + 1;
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && names.length % size != 0 ? names.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = names[i];
        }

        return paginationArray;
    }
}


