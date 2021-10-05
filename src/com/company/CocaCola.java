package com.company;

public class CocaCola implements Soda {
    private double cost = 35.99;

    public CocaCola(){}

    @Override
    public String getSodaDescription() {
        return "CocaCola";
    }

    @Override
    public double cost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
