package FactoryPattern;

import java.util.ArrayList;

//The Product
public abstract class Pizza {
    String name;
    String sauce;
    String dough;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }


    void bake() {
        System.out.println("Bake for 25 mins at high temprature");
    }

    void cut() {
        System.out.println("Cutting the pizza into small triangular pieces");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }
}

