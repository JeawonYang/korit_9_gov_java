package com.korit.study.ch21;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton instance;
    private String data;

    //싱글톤은 하나만 생성해야할때
    //외부에서 생성되면 안되니 private 사용
    //변수명은 instance로 할것

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)){
            instance = new Singleton("class Data");
        }
        return instance;
    }
    public static Singleton getSynchronizedInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton("Class Data");
                }
            }
        }
        return instance;
    }

    public void changeData() {
        System.out.println("데이터 변경." + data);
    }

    public void deleteData(){
        System.out.println("데이터 삭제." + data);
    }
}
