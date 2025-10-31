package com.korit.study.ch33;

    class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized void decrement() {
            count--;
        }

        public synchronized int getCount() {
            return count;
        }
    }
    public class ThreadMain {
    public static void main(String[] args) {

        /**
         * Thread (쓰레드)
         * 1. 싱글쓰레드 : 쓰레드 하나만 사용 (Main)
         * 2. 멀티쓰레드 : 쓰레드 두개 이상 사용
         */

        int sum = 0;
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("1번 반복문 : " + i);
                counter.increment();
//                sum += i;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("2번 반복문 : " + i);
                counter.increment();
//                sum += i;
            }
        });
        System.out.println("Thread 시작 !!!");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
//          여기서부터 Thread1 과 Thread2가 종료될 때까지 기다려라
            System.out.println(counter.getCount());
            System.out.println("쓰레드 종료!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread 종료 !!!");
    }
}
