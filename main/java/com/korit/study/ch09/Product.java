package com.korit.study.ch09;

public class Product {
    String name;
    int price;

    int discount() {
        return price - (int)(price * 0.2);
    }
}
