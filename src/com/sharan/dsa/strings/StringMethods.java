package com.sharan.dsa.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "sharan raj";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('s'));
    }
}
