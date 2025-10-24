package com.korit.study.ch26;


/*

    enumerated -> 열거, 나열

 */

enum Name {
    준일, 준이, 준삼
}

enum Name2 {

    // N1이라고 했을 때 준일이 나왔으면 좋겠다
    N1("준일"), N2("준이"), N3("준삼");

    private final String value;

    Name2(String name){
        this.value = name;
    }

    public String value(){
        return value;
    }
}

enum Writer{
    W1("김준일", 32), W2("김준이", 33), W3("김준삼", 34);

    private final String fullname;
    private final Integer age;

    Writer(String fullname, Integer age){
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getAge() {
        return age;
    }
}

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Name.준일);
        System.out.println(Name.준이);
        System.out.println(Name.준삼);
        System.out.println(Name2.N1.valueOf("N1"));
        System.out.println(Name2.N1.value()); // getter처럼 쓰임
        System.out.println(Name2.N2);
        System.out.println(Name2.N3);

        System.out.println(Writer.W1.getFullname());
        System.out.println(Writer.W1.getAge());
        Writer writer = Writer.W1;
    }

}
