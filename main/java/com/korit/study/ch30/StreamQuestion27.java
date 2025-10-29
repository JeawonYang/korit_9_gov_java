package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Item1 {
    String name;
    int stock;
    boolean onSale;
    int price;

    public Item1(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", onSale=" + onSale +
                ", price=" + price +
                '}';
    }
}

public class StreamQuestion27 {
    public static void main(String[] args) {
        List<Item1> items = Arrays.asList(
                new Item1("노트북", 5, true, 1000000),
                new Item1("마우스", 0, true, 30000),
                new Item1("키보드", 10, false, 50000),
                new Item1("헤드셋", 3, true, 80000),
                new Item1("웹캠", 0, false, 60000)
        );
        List<String> Sales = items.stream()
                .filter(sale -> sale.isOnSale() && sale.getStock() > 0)
                .map(Item1 :: getName)
                .collect(Collectors.toList());
        System.out.println(Sales);
    }
}
