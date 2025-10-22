package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = 10; //autoBoxing
        // Integer num3 =new Integer(10);
        int num4 = num2; //autoUnBoxing
        String numstr = Integer.toString(num);
        String numstr2 = "" + num;
        String numstr3 = num2.toString();

        boolean a = true;
        Boolean a1 = a;
        double b = 3.14;
        Double b1 = b;
        long c = 12345678910l;
        Long c1 = c;

    }
}
