package com.sharan.dsa;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = in.next();
        char ch = in.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char cha = string.charAt(i);
            if (cha == ch) {
                count++;
            }
        }
        System.out.println("count of " + ch + " is " + count);
    }
}
