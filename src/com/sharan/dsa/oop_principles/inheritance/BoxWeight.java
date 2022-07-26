package com.sharan.dsa.oop_principles.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // use to initialise values present in parent class
        this.weight = weight;
    }
}
