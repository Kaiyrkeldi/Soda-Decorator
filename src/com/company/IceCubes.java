package com.company;

public class IceCubes extends Additive {
    private String additiveName = "Ice Cubes";
    private double cost = 3.75;
    private Soda soda;

    public IceCubes(Soda soda) {
        this.soda = soda;
    }

    @Override
    public String getSodaDescription() {
        return soda.getSodaDescription() + ", " + additiveName;
    }

    @Override
    public double cost() {
        return soda.cost() + cost;
    }
}
