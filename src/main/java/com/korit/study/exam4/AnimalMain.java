package com.korit.study.exam4;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.printinfo();
        cat.printinfo();

        dog.move();
        dog.sound();

        cat.move();
        cat.sound();

        ArrayList<Animal> animals = new ArrayList<>();

    }
}
