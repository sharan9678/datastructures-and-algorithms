package com.sharan.dsa.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7);
        multiple(12, 13, "hello", "sharan", "raj");
    }

    static void multiple(int a, int b, String... v) {

    }

    // ... is variable amount of arguments "v"
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
