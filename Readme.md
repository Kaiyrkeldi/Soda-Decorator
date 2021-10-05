# Soda Decorator

This is my implementation of the decorator pattern, I implemented this pattern using the example of sodas.

## How this program works:

In this program you can order different types of sodas, namely sprite, Coca Cola or fanta. You can also make a Coke Float, it's Coca Cola and there's vanilla ice cream on top, and of course the price of a Coke Float will be different from regular Coca Cola. Also in the program you can add ice drinks, the price due to ice will also differ from the usual drink.


## Examples:
###Order 1:
#### Code:
~~~ 
   //Ordering Coke-Float by combining CocaCola and Vanilla ice cream.
       Soda cocaCola = new CocaCola();
       cocaCola = new VanillaIceCream(cocaCola);
       cocaCola = new IceCubes(cocaCola);
   
   // CocaCola order details.
        System.out.println("Order 1:");
        System.out.println(cocaCola.getSodaDescription() + " Cost: Rs." + cocaCola.cost());
        System.out.println("");
~~~
#### Output:
~~~
Order 1:
CocaCola, Vanilla Ice-Cream, Ice Cubes Cost: Rs.55.290000000000006
~~~

###Order 2:
#### Code:
~~~ 
   // Ordering a regular fanta.
        Soda fanta = new Fanta();
   
   /// Fanta order details.
        System.out.println("Order 2:");
        System.out.println(fanta.getSodaDescription() + " Cost: Rs." + fanta.cost());
        System.out.println("");
~~~
#### Output:
~~~
Order 2:
Fanta Cost: Rs.32.29
~~~

###Order 3:
#### Code:
~~~ 
   // Ordering a Sprite with extra ice cubes.
        Soda sprite = new Sprite();
        sprite = new IceCubes(sprite);
   
   // Sprite order details.
        System.out.println("Order 3:");
        System.out.println(sprite.getSodaDescription() + " Cost: Rs." + sprite.cost());
        System.out.println("");
~~~
#### Output:
~~~
Order 3:
Sprite, Ice Cubes Cost: Rs.33.739999999999995
~~~