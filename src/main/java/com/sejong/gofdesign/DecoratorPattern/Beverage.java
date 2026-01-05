package com.sejong.gofdesign.DecoratorPattern;

public abstract class Beverage {
    String description = "non title";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
