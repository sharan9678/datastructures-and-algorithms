package com.sharan.dsa;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int answer = 0;
        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            answer = answer * 10 + rem;
        }
        System.out.println(answer);
    }
}
