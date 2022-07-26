package com.sharan.dsa.oop_principles.inheritance;

public class main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " " + box.h + " " + box.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 0);
        System.out.println(box3.h + " " + box3.weight);
    }
}
