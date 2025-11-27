package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Item {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}



public class StreamQuestion14 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("사과", 3000),
                new Item("바나나", 2000),
                new Item("오렌지", 5000)
        );
        List<String> List = items.stream()
                .map(item -> item.getName() + "("
                        + item.getPrice() + "원)")
                        .collect(Collectors.toList());
        System.out.println(List);
    }
}
