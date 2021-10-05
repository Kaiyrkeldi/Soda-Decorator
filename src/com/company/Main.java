package com.company;

public class Main {

    public static void main(String[] args) {
        // Ordering beverages.
        orderBeverages();
    }

    private static void orderBeverages() {
        // Ordering Coke-Float by combining CocaCola and Vanilla ice cream.
        Soda cocaCola = new CocaCola();
        cocaCola = new VanillaIceCream(cocaCola);
        cocaCola = new IceCubes(cocaCola);

        // Ordering a regular fanta.
        Soda fanta = new Fanta();

        // Ordering a Sprite with extra ice cubes.
        Soda sprite = new Sprite();
        sprite = new IceCubes(sprite);

        // CocaCola order details.
        System.out.println("Order 1:");
        System.out.println(cocaCola.getSodaDescription() + " Cost:" + cocaCola.cost());
        System.out.println("");
        // Fanta order details.
        System.out.println("Order 2:");
        System.out.println(fanta.getSodaDescription() + " Cost:" + fanta.cost());
        System.out.println("");
        // Sprite order details.
        System.out.println("Order 3:");
        System.out.println(sprite.getSodaDescription() + " Cost:" + sprite.cost());
        System.out.println("");

    }
}
