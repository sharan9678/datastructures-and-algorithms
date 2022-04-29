package com.sharan.dsa;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("A round fruit");
                break;
            case "grapes":
                System.out.println("Small fruits");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
    }
}
