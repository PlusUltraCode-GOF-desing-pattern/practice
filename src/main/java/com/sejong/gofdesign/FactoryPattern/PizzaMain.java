package com.sejong.gofdesign.FactoryPattern;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
    }
}
