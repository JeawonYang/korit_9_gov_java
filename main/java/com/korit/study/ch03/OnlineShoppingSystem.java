package com.korit.study.ch03;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("고객 ID를 입력하세요 : ");
        String ID = sc.nextLine();
        System.out.print("상품코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.print("상품명을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수량을 입력하세요 : ");
        int amount = sc.nextInt();
        System.out.print("단가를 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("우편번호를 입력하세요 : ");
        int port = sc.nextInt();
        sc.nextLine();
        System.out.print("배송주소를 입력하세요 : ");
        String address = sc.nextLine();

        int total = 0;
        total = price * amount;

        String cost = total >= 30000 ? "무료" : "유료";

        System.out.println("=== 주문 확인서 ===");
        System.out.println(String.format("""
               고객 ID : %s
               상품정보 :
                  - 상품코드 : %s
                  - 상품명 : %s
                  - 단가 : %d * %d원
               배송정보 :
                  - 우편번호 : %d
                  - 주소 : %s
                  - 배송비 : 무료 (3만원 이상 구매)
               총 결제 금액 : %d""",ID, code, name, amount, price, port, address, total));
    }
}
