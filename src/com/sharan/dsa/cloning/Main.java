package com.sharan.dsa.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sharan = new Human(34, "sharan");
//        Human twin = new Human(sharan);

        Human twin = (Human) sharan.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
