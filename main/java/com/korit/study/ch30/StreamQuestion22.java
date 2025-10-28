package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class StreamQuestion22 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );

        List<String> price = products.stream()
                .filter(P -> P.getPrice() <= 500000 && P.getPrice() >= 50000)
                .map(Product :: getName)
                .collect(Collectors.toList());
        System.out.println(price);
    }
}
