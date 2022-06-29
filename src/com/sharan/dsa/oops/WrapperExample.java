package com.sharan.dsa.oops;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;
//        final A sharan = new A("sharan");
//        sharan = new A("hello");

        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("random name");
        }
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("object created");
        this.name = name;
    }
}
