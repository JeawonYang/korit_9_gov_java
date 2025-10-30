package com.korit.study.ch32;

class ThreadTest extends Thread {
    private String threadName;

    public ThreadTest(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " 실행 ");
    }
}

public class ThreadMain2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest T1 = new ThreadTest("T1");
        ThreadTest T2 = new ThreadTest("T2");
        ThreadTest T3 = new ThreadTest("T3");

        T1.start();
        T2.start();
        T3.start();

        T1.join();
        T2.join();
        T3.join();

        System.out.println("Main Method Exit");
    }
}
