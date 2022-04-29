package com.sharan.dsa.linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Sharan Raj";
        char target = 'u';
        System.out.println(searchString(name, target));
    }

    static boolean searchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char element : str.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
