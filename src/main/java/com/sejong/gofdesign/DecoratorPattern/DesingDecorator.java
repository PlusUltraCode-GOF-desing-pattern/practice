package com.sejong.gofdesign.DecoratorPattern;

public abstract class DesingDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}
