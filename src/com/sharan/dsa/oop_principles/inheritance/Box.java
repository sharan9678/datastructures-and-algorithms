package com.sharan.dsa.oop_principles.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box () {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box (Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
