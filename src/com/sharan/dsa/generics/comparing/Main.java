package com.sharan.dsa.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student sharan = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.52f);

        if (rahul.compareTo(sharan) > 0) {
            System.out.println("rahul scored more than sharan");
        }
    }
}
