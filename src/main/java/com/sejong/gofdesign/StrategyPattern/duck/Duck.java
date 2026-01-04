package com.sejong.gofdesign.StrategyPattern.duck;

import com.sejong.gofdesign.StrategyPattern.fly.FlyBehavior;
import com.sejong.gofdesign.StrategyPattern.quack.QuackBehavior;

public abstract class Duck {
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks are swimming");

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
