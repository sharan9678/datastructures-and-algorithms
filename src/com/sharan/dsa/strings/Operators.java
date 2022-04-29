package com.sharan.dsa.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        // int will be converted to Integer and call toString;
        // this is same as "a" + "1"
        System.out.println("a" + 1);

        System.out.println("sharan" + new ArrayList<>());

        // concatenation can only be applied on string and primitive datatype or wrapper class
        // System.out.println(new Integer(56) + new ArrayList<>() ); not allowed
    }
}
