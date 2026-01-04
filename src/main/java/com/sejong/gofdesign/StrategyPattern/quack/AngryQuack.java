package com.sejong.gofdesign.StrategyPattern.quack;

public class AngryQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Angry Quack!!");
    }
}
