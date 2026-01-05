package com.sejong.gofdesign.DecoratorPattern;

public class Cream extends CondimentDecorator {

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return 100.0 + beverage.cost();
    }
}
