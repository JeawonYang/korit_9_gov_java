package com.korit.study.ch29;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        //1. 매개변수x , 리턴x
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };
        runnable.run();

        /// /////////////////////////////////////////////
        Runnable runnable1 = () -> {
            System.out.println("runnable 인터페이스");
        };
        runnable1.run();

        //2. 매개변수 o, 리턴x
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consumer 인터페이스");
                System.out.println("매개변수 s :" + s);
            }
        };
        stringConsumer.accept("Consumer");

        Consumer<String> stringConsumer1 = s -> {
            System.out.println("Consumer 인터페이스");
            System.out.println("매개변수 s :" + s);
        };
        stringConsumer1.accept("Consumer");

        Consumer<Integer> andThenStudy = num -> {
            System.out.println("1");
            System.out.println(num);
        };
        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> {
            System.out.println("2");
            System.out.println(num2);
        });

        andThenStudy.accept(10);
        andThenStudy2.accept(20);

        Consumer<Double> doubleConsumer = d -> {
            System.out.println("1");
            System.out.println("숫자 : " + d);
        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자 : " + d);
        }).andThen(d -> {
            System.out.println("3");
            System.out.println("숫자 : " + d);
        }).andThen(d -> {
            System.out.println("4");
            System.out.println("숫자 : " + d);
        }).accept(3.14);

        //3. Supplier : 매00000000000000000000000000000000개변수 x 리턴 o
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);
        System.out.println(booleanSupplier.get());

        //4. 매개변수ㅠ o , 리턴 o
        Function<Integer, String> function = num -> Integer.toString(num);
        String functionResult = function.apply(10);
        System.out.println(functionResult);

        Double functionResult2 = function.andThen(s -> Double.parseDouble(s)).apply(20);
        System.out.println(functionResult2);
    }
}
