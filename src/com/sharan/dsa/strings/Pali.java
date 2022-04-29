package com.sharan.dsa.strings;

public class Pali {
    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

//    public static boolean isPali(String s) {
//        s = s.replaceAll("[^A-Za-z0-9]", "");
//        s = s.toLowerCase();
//        StringBuilder stringBuilder = new StringBuilder();
//    }
}
