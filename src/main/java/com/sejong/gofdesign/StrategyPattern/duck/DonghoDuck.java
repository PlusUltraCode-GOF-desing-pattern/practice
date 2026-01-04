package com.sejong.gofdesign.StrategyPattern.duck;

import com.sejong.gofdesign.StrategyPattern.fly.FlyWithWings;
import com.sejong.gofdesign.StrategyPattern.quack.Quack;

public class DonghoDuck extends Duck {
    public DonghoDuck() {
           quackBehavior = new Quack();
           flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a Dongho Duck");
    }
}
