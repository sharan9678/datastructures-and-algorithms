package com.sharan.dsa.functions;

public class FunctionOverloading {
    /*
    Function Overloading
    Declaring function with same name but with different argument type
    function overloading is done at COMPILE TIME
     */
    public static void main(String[] args) {
        fun(12);
        fun("Hello");
    }

    static void fun(int num) {
        System.out.println(num);
    }

    static void fun(String word) {
        System.out.println(word);
    }
}
