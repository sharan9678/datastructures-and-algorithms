package com.sharan.dsa.strings;

import java.util.Objects;

public class Comparision {
    public static void main(String[] args) {
        String a = "sharan";
        String b = "sharan";
        System.out.println(Objects.equals(a, b));
        System.out.println(a == b);

        String c = new String("raj");
        String d = new String("raj");
        System.out.println(c == d);
    }
}
