package com.sejong.gofdesign.StrategyPattern.fly;

public class FlyRocketWings implements FlyBehavior
{
    @Override
    public void fly() {
        System.out.println("I have a rocket. so I can go to universe using my rocket");
    }
}
