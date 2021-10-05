package com.company;

public class Sprite implements Soda {
    private double cost = 29.99;

    public Sprite() {
    }

    @Override
    public String getSodaDescription() {
        return "Sprite";
    }

    @Override
    public double cost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
