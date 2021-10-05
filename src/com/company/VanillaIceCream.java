package com.company;

public class VanillaIceCream extends Additive {
    private String additiveName = "Vanilla Ice-Cream";
    private double cost = 15.55;
    private Soda soda;

    public VanillaIceCream(Soda soda) {
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
