package com.sharan.dsa.functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 89; // this cannot be since it is already being initialised outside
            a = 78; // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            // values initialised in this block, will remain in the block
        }

        System.out.println(a);
        //System.out.println(c); // cannot be used outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
        }

        int num = 900; // this is valid

        // anything initialised outside the block cannot be initialised inside the block
        // but anything initialised inside the block can be initialised outside the block

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
