package com.sharan.dsa;

import java.util.Scanner;

public class AlphabetCheck {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
