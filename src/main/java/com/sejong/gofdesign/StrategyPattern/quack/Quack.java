package com.sejong.gofdesign.StrategyPattern.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QQuack");
    }
}
