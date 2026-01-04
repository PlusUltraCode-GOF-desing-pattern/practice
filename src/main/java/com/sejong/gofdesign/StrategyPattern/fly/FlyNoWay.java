package com.sejong.gofdesign.StrategyPattern.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly all of day");
    }
}
