package com.sejong.gofdesign.StrategyPattern.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
