package com.sejong.gofdesign.DecoratorPattern;

import java.awt.print.Paper;

public class PuppyPaint extends DesingDecorator{

    public PuppyPaint(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Puppy Paint";
    }

    @Override
    public double cost() {
        return 123456.0;
    }
}
