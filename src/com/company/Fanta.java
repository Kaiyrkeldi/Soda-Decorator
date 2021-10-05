package com.company;

public class Fanta implements Soda {
    private double cost = 32.29;

    public Fanta() {
    }
    @Override
    public String getSodaDescription() {
        return "Fanta";
    }

    @Override
    public double cost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
